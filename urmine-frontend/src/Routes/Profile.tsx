import styled from "styled-components";
import Badge from "../components/Badge";

const Container = styled.section`
  width: 100%;
  padding: 20px 0;
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
  gap: 80px 0px;
`;

const badges = [
  {
    id: 1,
    imgUrl: "https://i.ibb.co/yVVtWq5/Rattata.webp",
    name: "노말",
  },
  {
    id: 2,
    imgUrl: "https://i.ibb.co/d45xm2r/Charmander.webp",
    name: "불꽃",
  },
  {
    id: 3,
    imgUrl: "https://i.ibb.co/x1g2dcB/Squirtle.webp",
    name: "물",
  },
  {
    id: 4,
    imgUrl: "https://i.ibb.co/WnPg5By/Bulbasaur.webp",
    name: "풀",
  },
  {
    id: 5,
    imgUrl: "https://i.ibb.co/qmG3Q8w/Pikachu.webp",
    name: "전기",
  },
  {
    id: 6,
    imgUrl: "https://i.ibb.co/5KN8SWC/Lapras.webp",
    name: "얼음",
  },
  {
    id: 7,
    imgUrl: "https://i.ibb.co/80hLRM3/Mankey.webp",
    name: "격투",
  },
  {
    id: 8,
    imgUrl: "https://i.ibb.co/n1fbR1z/Koffing.webp",
    name: "독",
  },
  {
    id: 9,
    imgUrl: "https://i.ibb.co/5KDc0Cm/Diglett.png",
    name: "땅",
  },
  {
    id: 10,
    imgUrl: "https://i.ibb.co/CPPJhTF/Pidgey.webp",
    name: "비행",
  },
  {
    id: 11,
    imgUrl: "https://i.ibb.co/NtYdYC1/Abra.webp",
    name: "에스퍼",
  },
  {
    id: 12,
    imgUrl: "https://i.ibb.co/jrJx5Jw/Caterpie.png",
    name: "벌레",
  },
  {
    id: 13,
    imgUrl: "https://i.ibb.co/THvt58S/Onix.webp",
    name: "바위",
  },
  {
    id: 14,
    imgUrl: "https://i.ibb.co/N1brb6m/Gastly.webp",
    name: "고스트",
  },
  {
    id: 15,
    imgUrl: "https://i.ibb.co/fv5PGrL/Dratini.webp",
    name: "드래곤",
  },
  {
    id: 16,
    imgUrl: "https://i.ibb.co/9nqNvg3/Zapdos.webp",
    name: "전설의 새",
  },
  {
    id: 17,
    imgUrl: "https://i.ibb.co/fFn38Zx/Mew.webp",
    name: "유전",
  },
  {
    id: 18,
    imgUrl: "https://i.ibb.co/yYfk0HB/image.png",
    name: "미획득",
  },
];

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
      <BadgeBox>
        {badges.map((badge) => {
          return <Badge key={badge.id} {...badge} />;
        })}
      </BadgeBox>
    </>
  );
}

export default Profile;
