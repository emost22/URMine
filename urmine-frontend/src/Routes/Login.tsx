import styled from "styled-components";
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
  return (
    <Container>
      <Typeit />
      <LoginImg src="/images/kakao_login_large_wide.png" alt="login" />
    </Container>
  );
}

export default Login;
