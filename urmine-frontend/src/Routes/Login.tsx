import styled from "styled-components";

const Container = styled.div`
  background-color: burlywood;
  flex: 1;
  position: relative;
`;

const LoginImg = styled.img`
  position: relative;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
`;

function Login() {
  return (
    <Container>
      <LoginImg src="/images/kakao_login_large_wide.png" alt="login" />
    </Container>
  );
}

export default Login;
