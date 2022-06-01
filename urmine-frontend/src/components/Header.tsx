import { Link } from "react-router-dom";
import styled from "styled-components";

const Head = styled.header`
  width: 100vw;
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 0 10vw;
`;

const Logo = styled.img`
  width: 150px;
  padding: 15px 0;
`;

const Icons = styled.div`
  display: flex;
  height: 55px;
`;

const StyledLink = styled(Link)`
  display: flex;
  flex-direction: column;
  margin-left: 50px;
  align-items: center;
  justify-content: space-between;
  cursor: pointer;
  text-decoration: none;
  color: black;
`;

const Icon = styled.img`
  width: 30px;
  height: 30px;
`;

const IconDesc = styled.span`
  font-size: 12px;
  text-align: center;
  width: 50px;
`;

function Header() {
  let isLogin = false;

  return (
    <Head>
      <Link to={"/"}>
        <Logo src="/images/logo.png" alt="Logo" />
      </Link>
      <Icons>
        {isLogin ? (
          <>
            <StyledLink to={"/pokedex"}>
              <Icon src="/images/monsterball.png" alt="pokedex" />
              <IconDesc>내 도감</IconDesc>
            </StyledLink>
            <StyledLink to={"/user/1"}>
              <Icon src="/images/profile.png" alt="profile" />
              <IconDesc>프로필</IconDesc>
            </StyledLink>
            <StyledLink to={"/logout"}>
              <Icon src="/images/logout.png" alt="logout" />
              <IconDesc>로그아웃</IconDesc>
            </StyledLink>
          </>
        ) : (
          <>
            <StyledLink to={"/pokedex"}>
              <Icon src="/images/monsterball.png" alt="pokedex" />
              <IconDesc>도감</IconDesc>
            </StyledLink>
            <StyledLink to={"/login"}>
              <Icon src="/images/login.png" alt="login" />
              <IconDesc>로그인</IconDesc>
            </StyledLink>
          </>
        )}
      </Icons>
    </Head>
  );
}

export default Header;
