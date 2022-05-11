import HomeContainer, {
  IHomeContainerProps,
} from "../components/HomeContainer";
import Typeit from "../components/Typeit";

const infoList: IHomeContainerProps[] = [
  {
    title: "띠부띠부씰 보유 현황",
    description:
      "내가 어떤 띠부띠부씰을 가지고 있는지 혹은 가지고 있지 않은지 쉽게 확인할 수 있어요.",
    imgUrl: "",
    bgColor: "#F9FAFB",
  },
  {
    title: "체육관 배지",
    description:
      "포켓몬스터하면 빼놓을 수 없는 채육관 배지! 159가지의 띠부띠부씰을 모으다 보면 조건 만족 시 자동으로 배지를 획득해요.",
    imgUrl: "",
    bgColor: "#FFFFFF",
  },
  {
    title: "SNS 공유",
    description: "내가 모은 띠부띠부씰을 친구들에게 쉽게 공유할 수 있어요.",
    imgUrl: "",
    bgColor: "#F9FAFB",
  },
  {
    title: "반응형 웹",
    description:
      "PC, 테블릿, 모바일 등 어떤 기기에서든 최적화된 서비스를 이용해보세요.",
    imgUrl: "",
    bgColor: "#FFFFFF",
  },
];

function Home() {
  return (
    <div>
      <Typeit />
      <main>
        {infoList.map((info) => (
          <HomeContainer {...info} />
        ))}
      </main>
    </div>
  );
}

export default Home;
