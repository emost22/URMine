import styled from "styled-components";

const Container = styled.div`
  display: flex;
  flex-direction: column;
  align-items: center;
`;

const Img = styled.img`
  width: 150px;
  height: 150px;
`;

const Name = styled.div`
  margin-top: 10px;
  font-weight: 600;
`;

interface BadgeProps {
  id: number;
  imgUrl: string;
  name: string;
}

function Badge({ id, imgUrl, name }: BadgeProps) {
  return (
    <Container>
      <Img src={imgUrl} alt={"" + id} />
      <Name>{name}</Name>
    </Container>
  );
}

export default Badge;
