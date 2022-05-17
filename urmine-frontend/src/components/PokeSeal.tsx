import { MouseEvent } from "react";
import { useState } from "react";
import styled from "styled-components";

const Container = styled.div`
  display: flex;
  flex-direction: column;
  gap: 20px;
  align-items: center;
`;

const Seal = styled.div`
  width: 200px;
  height: 200px;
  box-shadow: 1px 1px 4px rgba(0, 0, 0, 0.25);
  position: relative;
`;

const InfoBox = styled.div`
  position: absolute;
  width: 90px;
  height: 20px;
  border-radius: 10px;
  box-shadow: 1px 1px 2px rgba(0, 0, 0, 0.25);
  top: 10px;
  left: 10px;
  font-size: 11px;
  font-weight: 500;
  line-height: 20px;
  display: flex;
`;

const Id = styled.div`
  width: 30px;
  height: 20px;
  border-radius: 10px;
  text-align: center;
  background-color: ${(props) => props.color};
`;

const Name = styled.div`
  width: 60px;
  hegiht: 20px;
  border-radius: 10px;
  text-align: center;
  padding-right: 5px;
`;

const Img = styled.img`
  position: relative;
  width: 130px;
  height: 130px;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -46%);
`;

const CountBox = styled.div`
  display: flex;
  justify-content: space-between;
  align-items: center;
  width: 150px;
  height: 40px;
  border-radius: 20px;
  border: 1px solid ${(props) => props.color};
`;

const CountBtn = styled.button`
  width: 50px;
  height: 40px;
  border-radius: 20px;
  border: none;
  outline: none;
  background-color: ${(props) => props.color};
  font-size: 16px;
  font-weight: 500;
`;

const Count = styled.div`
  font-size: 16px;
`;

interface PokeSealProps {
  pokemonId: number;
  pokemonName: string;
  grayImgUrl: string;
  colorImgUrl: string;
  color: string;
}

function PokeSeal({
  pokemonId,
  pokemonName,
  grayImgUrl,
  colorImgUrl,
  color,
}: PokeSealProps) {
  const [count, setCount] = useState(0);

  const make3Digit = (id: number) => {
    const strId = "000" + id;
    return strId.slice(strId.length - 3);
  };

  const handleClick = (e: MouseEvent<HTMLButtonElement>) => {
    const {
      currentTarget: { innerText },
    } = e;
    if (innerText === "+") {
      setCount((prev) => prev + 1);
    } else {
      if (count <= 0) return;
      setCount((prev) => prev - 1);
    }
  };

  return (
    <Container>
      <Seal>
        <InfoBox>
          <Id color={color}>{make3Digit(pokemonId)}</Id>
          <Name>{pokemonName}</Name>
        </InfoBox>
        <Img src={count >= 1 ? colorImgUrl : grayImgUrl} alt={pokemonName} />
      </Seal>
      <CountBox color={color}>
        <CountBtn color={color} onClick={handleClick}>
          -
        </CountBtn>
        <Count>{count}</Count>
        <CountBtn color={color} onClick={handleClick}>
          +
        </CountBtn>
      </CountBox>
    </Container>
  );
}

export default PokeSeal;
