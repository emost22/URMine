import styled from "styled-components";

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
  const make3Digit = (id: number) => {
    const strId = "000" + id;
    return strId.slice(strId.length - 3);
  };

  return (
    <Seal>
      <InfoBox>
        <Id color={color}>{make3Digit(pokemonId)}</Id>
        <Name>{pokemonName}</Name>
      </InfoBox>
      <Img src={colorImgUrl} alt={pokemonName} />
    </Seal>
  );
}

export default PokeSeal;
