package com.example.backend.sharedlibrary;

import com.example.backend.sharedlibrary.model.RentHistory;
import com.example.backend.sharedlibrary.repository.BookRepository;
import com.example.backend.sharedlibrary.repository.RentHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rent-history")
public class RentHistoryRestController {
    @Autowired
    private RentHistoryRepository rentHistoryRepository;
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/")
    public ResponseEntity<List<RentHistory>> getAllRentHistory() {
        List<RentHistory> rentHistory = rentHistoryRepository.findAll();
        if(rentHistory.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(rentHistory, HttpStatus.OK);
    }

    @GetMapping("/{historyId}")
    public ResponseEntity<RentHistory> getRentHistoryById(@PathVariable Long historyId){
        Optional<RentHistory> rentHistoryData = rentHistoryRepository.findById(historyId);
        return rentHistoryData.map(rentHistory -> new ResponseEntity<>(rentHistory, HttpStatus.OK))
                .orElseGet(()->new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{historyId}")
    public ResponseEntity<RentHistory> updateRentHistory(@PathVariable Long historyId,
                                                         @RequestBody RentHistory rentHistoryDetails) {
        Optional<RentHistory> rentHistoryData = rentHistoryRepository.findById(historyId);

        if (!rentHistoryData.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        RentHistory rentHistory = rentHistoryData.get();
        rentHistory.setDateReturned(rentHistory.getDateReturned());
        RentHistory updatedRentHistory = rentHistoryRepository.save(rentHistory);
        return new ResponseEntity<>(updatedRentHistory, HttpStatus.OK);
    }

    @DeleteMapping("/{historyId}")
    public ResponseEntity<HttpStatus> deleteRentHistory(@PathVariable Long historyId) {
        try {
            rentHistoryRepository.deleteById(historyId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
