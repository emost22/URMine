import styled from "styled-components";
import { getKakaoLoginPage } from "../api/user";
import Typeit from "../components/Typeit";

const Container = styled.div`
  flex: 1;
  position: relative;
`;

const LoginImg = styled.img`
  width: 400px;
  position: relative;
  top: 30%;
  left: 50%;
  transform: translate(-50%, 0);
`;

function Login() {
  async function onClick() {
    const url = await getKakaoLoginPage();
    window.location.href = url;
  }

  return (
    <Container>
      <Typeit />
      <LoginImg
        src="/images/kakao_login_large_wide.png"
        alt="login"
        onClick={onClick}
      />
    </Container>
  );
}

export default Login;
