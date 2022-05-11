import styled from "styled-components";
import TypeIt from "typeit-react";

const Container = styled.section`
  width: 100%;
  height: 200px;
  background-color: #393939;
  display: flex;
  justify-content: center;
  align-items: center;
  color: white;
  font-size: 2rem;
`;

function Typeit() {
  return (
    <Container>
      <TypeIt
        options={{ speed: 100 }}
        getBeforeInit={(instance) => {
          instance
            .type('<strong style="color:#C8E4BE;">이상해씨</strong> 넌 내꺼야!')
            .pause(2000)
            .move(-7)
            .delete(4)
            .type('<strong style="color:#E9AC8F">파이리</strong>')
            .pause(2000)
            .delete(3)
            .type('<strong style="color:#B0E2F3">꼬부기</strong>')
            .pause(2000)
            .delete(3)
            .type('<strong style="color:#C8E4BE">캐터피</strong>')
            .pause(2000)
            .delete(3)
            .type('<strong style="color:#F4D8A1">뿔충이</strong>')
            .pause(2000)
            .delete(3)
            .type('<strong style="color:#D7B08C">구구</strong>')
            .pause(2000)
            .delete(2)
            .type('<strong style="color:#D6B1D3">꼬렛</strong>')
            .pause(2000)
            .delete(2)
            .type('<strong style="color:#FACAD5">깨비참</strong>')
            .pause(2000)
            .delete(3)
            .type('<strong style="color:#D6B1D3">아보</strong>')
            .pause(2000)
            .delete(2)
            .type('<strong style="color:#F7E3A6">피카츄</strong>');

          return instance;
        }}
      />
    </Container>
  );
}

export default Typeit;
