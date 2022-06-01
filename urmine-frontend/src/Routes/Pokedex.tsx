import { useEffect } from "react";
import { useNavigate } from "react-router-dom";
import styled from "styled-components";
import { getToken } from "../api/user";
import PokeSeal from "../components/PokeSeal";
import Search from "../components/Search";

const pokemons = [
  {
    pokemonId: 1,
    pokemonName: "이상해씨",
    kind: "풀",
    color: "#C8E4BE",
    description:
      "태어났을 때부터 등에 식물의 씨앗이 있으며 조금씩 크게 자란다.",
    isEvolution: true,
    grayImgUrl: "https://i.ibb.co/vLDTvj6/1-1.png",
    colorImgUrl: "https://i.ibb.co/2M02khG/1.png",
  },
  {
    pokemonId: 10,
    pokemonName: "이상해씨",
    kind: "풀",
    color: "#C8E4BE",
    description:
      "태어났을 때부터 등에 식물의 씨앗이 있으며 조금씩 크게 자란다.",
    isEvolution: true,
    grayImgUrl: "https://i.ibb.co/vLDTvj6/1-1.png",
    colorImgUrl: "https://i.ibb.co/2M02khG/1.png",
  },
  {
    pokemonId: 100,
    pokemonName: "이상해씨",
    kind: "풀",
    color: "#C8E4BE",
    description:
      "태어났을 때부터 등에 식물의 씨앗이 있으며 조금씩 크게 자란다.",
    isEvolution: true,
    grayImgUrl: "https://i.ibb.co/vLDTvj6/1-1.png",
    colorImgUrl: "https://i.ibb.co/2M02khG/1.png",
  },
  {
    pokemonId: 1,
    pokemonName: "이상해씨",
    kind: "풀",
    color: "#C8E4BE",
    description:
      "태어났을 때부터 등에 식물의 씨앗이 있으며 조금씩 크게 자란다.",
    isEvolution: true,
    grayImgUrl: "https://i.ibb.co/vLDTvj6/1-1.png",
    colorImgUrl: "https://i.ibb.co/2M02khG/1.png",
  },
  {
    pokemonId: 1,
    pokemonName: "이상해씨",
    kind: "풀",
    color: "#C8E4BE",
    description:
      "태어났을 때부터 등에 식물의 씨앗이 있으며 조금씩 크게 자란다.",
    isEvolution: true,
    grayImgUrl: "https://i.ibb.co/vLDTvj6/1-1.png",
    colorImgUrl: "https://i.ibb.co/2M02khG/1.png",
  },
  {
    pokemonId: 1,
    pokemonName: "이상해씨",
    kind: "풀",
    color: "#C8E4BE",
    description:
      "태어났을 때부터 등에 식물의 씨앗이 있으며 조금씩 크게 자란다.",
    isEvolution: true,
    grayImgUrl: "https://i.ibb.co/vLDTvj6/1-1.png",
    colorImgUrl: "https://i.ibb.co/2M02khG/1.png",
  },
  {
    pokemonId: 1,
    pokemonName: "이상해씨",
    kind: "풀",
    color: "#C8E4BE",
    description:
      "태어났을 때부터 등에 식물의 씨앗이 있으며 조금씩 크게 자란다.",
    isEvolution: true,
    grayImgUrl: "https://i.ibb.co/vLDTvj6/1-1.png",
    colorImgUrl: "https://i.ibb.co/2M02khG/1.png",
  },
  {
    pokemonId: 1,
    pokemonName: "이상해씨",
    kind: "풀",
    color: "#C8E4BE",
    description:
      "태어났을 때부터 등에 식물의 씨앗이 있으며 조금씩 크게 자란다.",
    isEvolution: true,
    grayImgUrl: "https://i.ibb.co/vLDTvj6/1-1.png",
    colorImgUrl: "https://i.ibb.co/2M02khG/1.png",
  },
  {
    pokemonId: 1,
    pokemonName: "이상해씨",
    kind: "풀",
    color: "#C8E4BE",
    description:
      "태어났을 때부터 등에 식물의 씨앗이 있으며 조금씩 크게 자란다.",
    isEvolution: true,
    grayImgUrl: "https://i.ibb.co/vLDTvj6/1-1.png",
    colorImgUrl: "https://i.ibb.co/2M02khG/1.png",
  },
  {
    pokemonId: 1,
    pokemonName: "이상해씨",
    kind: "풀",
    color: "#C8E4BE",
    description:
      "태어났을 때부터 등에 식물의 씨앗이 있으며 조금씩 크게 자란다.",
    isEvolution: true,
    grayImgUrl: "https://i.ibb.co/vLDTvj6/1-1.png",
    colorImgUrl: "https://i.ibb.co/2M02khG/1.png",
  },
  {
    pokemonId: 1,
    pokemonName: "이상해씨",
    kind: "풀",
    color: "#C8E4BE",
    description:
      "태어났을 때부터 등에 식물의 씨앗이 있으며 조금씩 크게 자란다.",
    isEvolution: true,
    grayImgUrl: "https://i.ibb.co/vLDTvj6/1-1.png",
    colorImgUrl: "https://i.ibb.co/2M02khG/1.png",
  },
  {
    pokemonId: 1,
    pokemonName: "이상해씨",
    kind: "풀",
    color: "#C8E4BE",
    description:
      "태어났을 때부터 등에 식물의 씨앗이 있으며 조금씩 크게 자란다.",
    isEvolution: true,
    grayImgUrl: "https://i.ibb.co/vLDTvj6/1-1.png",
    colorImgUrl: "https://i.ibb.co/2M02khG/1.png",
  },
  {
    pokemonId: 1,
    pokemonName: "이상해씨",
    kind: "풀",
    color: "#C8E4BE",
    description:
      "태어났을 때부터 등에 식물의 씨앗이 있으며 조금씩 크게 자란다.",
    isEvolution: true,
    grayImgUrl: "https://i.ibb.co/vLDTvj6/1-1.png",
    colorImgUrl: "https://i.ibb.co/2M02khG/1.png",
  },
  {
    pokemonId: 1,
    pokemonName: "이상해씨",
    kind: "풀",
    color: "#C8E4BE",
    description:
      "태어났을 때부터 등에 식물의 씨앗이 있으며 조금씩 크게 자란다.",
    isEvolution: true,
    grayImgUrl: "https://i.ibb.co/vLDTvj6/1-1.png",
    colorImgUrl: "https://i.ibb.co/2M02khG/1.png",
  },
  {
    pokemonId: 1,
    pokemonName: "이상해씨",
    kind: "풀",
    color: "#C8E4BE",
    description:
      "태어났을 때부터 등에 식물의 씨앗이 있으며 조금씩 크게 자란다.",
    isEvolution: true,
    grayImgUrl: "https://i.ibb.co/vLDTvj6/1-1.png",
    colorImgUrl: "https://i.ibb.co/2M02khG/1.png",
  },
  {
    pokemonId: 1,
    pokemonName: "이상해씨",
    kind: "풀",
    color: "#C8E4BE",
    description:
      "태어났을 때부터 등에 식물의 씨앗이 있으며 조금씩 크게 자란다.",
    isEvolution: true,
    grayImgUrl: "https://i.ibb.co/vLDTvj6/1-1.png",
    colorImgUrl: "https://i.ibb.co/2M02khG/1.png",
  },
  {
    pokemonId: 1,
    pokemonName: "이상해씨",
    kind: "풀",
    color: "#C8E4BE",
    description:
      "태어났을 때부터 등에 식물의 씨앗이 있으며 조금씩 크게 자란다.",
    isEvolution: true,
    grayImgUrl: "https://i.ibb.co/vLDTvj6/1-1.png",
    colorImgUrl: "https://i.ibb.co/2M02khG/1.png",
  },
  {
    pokemonId: 1,
    pokemonName: "이상해씨",
    kind: "풀",
    color: "#C8E4BE",
    description:
      "태어났을 때부터 등에 식물의 씨앗이 있으며 조금씩 크게 자란다.",
    isEvolution: true,
    grayImgUrl: "https://i.ibb.co/vLDTvj6/1-1.png",
    colorImgUrl: "https://i.ibb.co/2M02khG/1.png",
  },
  {
    pokemonId: 1,
    pokemonName: "이상해씨",
    kind: "풀",
    color: "#C8E4BE",
    description:
      "태어났을 때부터 등에 식물의 씨앗이 있으며 조금씩 크게 자란다.",
    isEvolution: true,
    grayImgUrl: "https://i.ibb.co/vLDTvj6/1-1.png",
    colorImgUrl: "https://i.ibb.co/2M02khG/1.png",
  },
  {
    pokemonId: 1,
    pokemonName: "이상해씨",
    kind: "풀",
    color: "#C8E4BE",
    description:
      "태어났을 때부터 등에 식물의 씨앗이 있으며 조금씩 크게 자란다.",
    isEvolution: true,
    grayImgUrl: "https://i.ibb.co/vLDTvj6/1-1.png",
    colorImgUrl: "https://i.ibb.co/2M02khG/1.png",
  },
  {
    pokemonId: 1,
    pokemonName: "이상해씨",
    kind: "풀",
    color: "#C8E4BE",
    description:
      "태어났을 때부터 등에 식물의 씨앗이 있으며 조금씩 크게 자란다.",
    isEvolution: true,
    grayImgUrl: "https://i.ibb.co/vLDTvj6/1-1.png",
    colorImgUrl: "https://i.ibb.co/2M02khG/1.png",
  },
  {
    pokemonId: 1,
    pokemonName: "이상해씨",
    kind: "풀",
    color: "#C8E4BE",
    description:
      "태어났을 때부터 등에 식물의 씨앗이 있으며 조금씩 크게 자란다.",
    isEvolution: true,
    grayImgUrl: "https://i.ibb.co/vLDTvj6/1-1.png",
    colorImgUrl: "https://i.ibb.co/2M02khG/1.png",
  },
  {
    pokemonId: 1,
    pokemonName: "이상해씨",
    kind: "풀",
    color: "#C8E4BE",
    description:
      "태어났을 때부터 등에 식물의 씨앗이 있으며 조금씩 크게 자란다.",
    isEvolution: true,
    grayImgUrl: "https://i.ibb.co/vLDTvj6/1-1.png",
    colorImgUrl: "https://i.ibb.co/2M02khG/1.png",
  },
  {
    pokemonId: 1,
    pokemonName: "이상해씨",
    kind: "풀",
    color: "#C8E4BE",
    description:
      "태어났을 때부터 등에 식물의 씨앗이 있으며 조금씩 크게 자란다.",
    isEvolution: true,
    grayImgUrl: "https://i.ibb.co/vLDTvj6/1-1.png",
    colorImgUrl: "https://i.ibb.co/2M02khG/1.png",
  },
];

const PokeContainer = styled.main`
  padding: 60px 0px;
  width: 100vw;
  display: grid;
  grid-template-columns: repeat(6, minmax(200px, auto));
  justify-items: center;
  gap: 60px 0px;
`;

let code = new URL(window.location.href).searchParams.get("code");

function Pokedex() {
  const navigate = useNavigate();

  async function kakaoLogin(code: string) {
    const data = JSON.parse(await getToken(code));
    if (data.status !== 500) {
      localStorage.setItem("accessToken", data.accessToken);
      navigate("/pokedex");
    }
  }

  useEffect(() => {
    if (code !== null) {
      kakaoLogin(code);
    }
  }, []);

  return (
    <>
      <Search></Search>
      <PokeContainer>
        {pokemons.map((pokemon, idx) => (
          <PokeSeal key={idx} {...pokemon} />
        ))}
      </PokeContainer>
    </>
  );
}

export default Pokedex;
