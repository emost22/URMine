import { Link } from "react-router-dom";
import styled from "styled-components";

const Head = styled.header`
  width: 100vw;
  height: 120px;
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 0 150px;
`;

const Logo = styled.img`
  width: 150px;
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
  font-size: 14px;
`;

function Header() {
  const isLogin = false;
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
            <StyledLink to={"/profile"}>
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
