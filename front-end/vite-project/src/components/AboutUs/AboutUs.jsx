import React from "react";
import { Link } from "react-router-dom";
import styled from "styled-components";

export function AboutUs({}) {
  return (
    <StyledAboutUs>
      <h1>About us</h1>
      <div className="main_content">
        <div>
          Welcome to our education-sharing platform! We are a team of passionate
          individuals who believe that education should be accessible to all,
          regardless of their socio-economic status. Our mission is to make it
          easier for people to share their books and knowledge with others, and
          to promote a culture of lifelong learning. Our team built this
          platform with the goal of creating a library where anyone can share
          their books and borrow from others in their community. By doing so, we
          hope to not only reduce the financial burden of education but also
          foster a sense of community and collaboration among our users. We are
          constantly working to improve our platform and make it more
          user-friendly, secure, and accessible. If you have any suggestions or
          feedback, please don't hesitate to reach out to us. We are always
          looking for ways to make our platform better and more impactful. Thank
          you for joining us on this journey towards a more equitable and
          accessible education system.
        </div>
        <div className="team-members">
          <h3>Team members: </h3>
          <ul className="team-list">
            <li>Stefan Anevski - anevskistefan11@gmail.com</li>
            <li>Boris Todorov - b.todorov52@gmail.com</li>
            <li>Renee Chiu - chiuwingyin@gmail.com</li>
          </ul>
        </div>
      </div>
    </StyledAboutUs>
  );
}

const StyledAboutUs = styled.div`
  h1 {
    margin: 40px;
    text-align: center;
  }

  .main_content {
    width: 70%;
    text-align: center;
    margin: 0 auto;
    line-height: 1.7;
  }

  .team-members {
    margin-top: 60px;
  }

  .team-list {
    list-style: none;
  }
`;
