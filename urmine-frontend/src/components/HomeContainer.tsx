import styled from "styled-components";

const Container = styled.div`
  height: 120vh;
  display: flex;
  justify-content: space-evenly;
  align-items: center;
  background-color: ${(props) => props.color};
`;

const TextBox = styled.div`
  width: 500px;
  height: 20%;
  display: flex;
  flex-direction: column;
  justify-content: center;
`;

const Title = styled.div`
  font-size: 18px;
  color: #ffd102;
  font-weight: 500;
  margin-bottom: 14px;
`;

const Description = styled.div`
  font-size: 14px;
  width: 300px;
  line-height: 18px;
`;

const ImgBox = styled.div`
  width: 500px;
  height: 500px;
  background-color: skyblue;
`;

export interface IHomeContainerProps {
  title: string;
  description: string;
  imgUrl: string;
  bgColor: string;
}

function HomeContainer({
  title,
  description,
  imgUrl,
  bgColor,
}: IHomeContainerProps) {
  return (
    <Container color={bgColor}>
      <TextBox>
        <Title>{title}</Title>
        <Description>{description}</Description>
      </TextBox>
      <ImgBox />
    </Container>
  );
}

export default HomeContainer;
