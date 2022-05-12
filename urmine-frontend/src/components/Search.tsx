import styled from "styled-components";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faMagnifyingGlass } from "@fortawesome/free-solid-svg-icons";

const Container = styled.section`
  width: 100%;
  height: 200px;
  background-color: #393939;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  color: white;
  font-size: 2rem;
`;

const Box = styled.div`
  height: 60px;
  display: flex;
  justify-content: center;
  align-items: center;
`;

const Span = styled.span`
  color: white;
  font-size: 18px;
  width: 200px;
  font-weight: 500;
`;

const IconBox = styled.div`
  width: 600px;
  display: flex;
  justify-content: space-between;
  align-items: center;
`;

const Icon = styled.img`
  width: 30px;
  height: 30px;
  border-radius: 15px;
`;

const Input = styled.input`
  width: 600px;
  box-sizing: border-box;
  padding: 10px 20px;
  border: none;
  background-color: black;
  color: white;
  font-size: 16px;
  border-radius: 5px;
  &:focus {
    outline: none;
  }
`;

const InputBox = styled.div`
  position: relative;
`;

const Icons = [
  { name: "normal", src: "/images/types/normal.png" },
  { name: "fire", src: "/images/types/fire.png" },
  { name: "water", src: "/images/types/water.png" },
  { name: "grass", src: "/images/types/grass.png" },
  { name: "electric", src: "/images/types/electric.png" },
  { name: "ice", src: "/images/types/ice.png" },
  { name: "fight", src: "/images/types/fight.png" },
  { name: "poison", src: "/images/types/poison.png" },
  { name: "ground", src: "/images/types/ground.png" },
  { name: "flying", src: "/images/types/flying.png" },
  { name: "psychic", src: "/images/types/psychic.png" },
  { name: "bug", src: "/images/types/bug.png" },
  { name: "rock", src: "/images/types/rock.png" },
  { name: "ghost", src: "/images/types/ghost.png" },
  { name: "dragon", src: "/images/types/dragon.png" },
];

function Search() {
  return (
    <Container>
      <Box>
        <Span>타입별 검색</Span>
        <IconBox>
          {Icons.map((icon) => (
            <Icon src={icon.src} alt={icon.name} />
          ))}
        </IconBox>
      </Box>
      <Box>
        <Span>이름 검색</Span>
        <InputBox>
          <Input />
          <FontAwesomeIcon
            icon={faMagnifyingGlass}
            size="xs"
            style={{
              position: "absolute",
              top: "50%",
              right: "10px",
              transform: "translate(0, -40%)",
              cursor: "pointer",
            }}
          ></FontAwesomeIcon>
        </InputBox>
      </Box>
    </Container>
  );
}

export default Search;
