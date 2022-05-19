import styled from "styled-components";

const Container = styled.section`
  width: 100%;
  height: 120px;
  background-color: #393939;
  display: flex;
  justify-content: center;
  align-items: center;
  gap: 50px;
`;

const PorfileImg = styled.img`
  width: 80px;
  height: 80px;
  border-radius: 50%;
  background-color: #c4c4c4;
`;

const ProfileBox = styled.div`
  color: white;
  font-size: 14px;
  height: 80px;
  display: flex;
  flex-direction: column;
  justify-content: space-evenly;
`;

const Key = styled.span`
  color: #858585;
`;

const BadgeTitle = styled.div`
  padding: 60px 100px;
  font-size: 24px;
  font-weight: 600;
`;

const BadgeBox = styled.main`
  padding: 60px 0px;
  width: 100vw;
  display: grid;
  grid-template-columns: repeat(6, minmax(200px, auto));
  justify-items: center;
  gap: 60px 0px;
`;

function Profile() {
  return (
    <>
      <Container>
        <PorfileImg />
        <ProfileBox>
          <div>
            <Key>주인공</Key> 포켓몬 마스터
          </div>
          <div>
            <Key>배지 갯수</Key> 4개
          </div>
          <div>
            <Key>포켓몬 도감</Key> 20마리
          </div>
        </ProfileBox>
      </Container>
      <BadgeTitle>배지</BadgeTitle>
      <BadgeBox></BadgeBox>
    </>
  );
}

export default Profile;
