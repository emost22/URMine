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

const IconBox = styled.div`
  display: flex;
  flex-direction: column;
  padding-left: 50px;
  align-items: center;
  justify-content: space-between;
`;

const Icon = styled.img`
  width: 30px;
  height: 30px;
`;

const IconDesc = styled.span`
  font-size: 14px;
`;

function Header() {
  const isLogin = true;
  return (
    <Head>
      <Logo
        src="https://s3.us-west-2.amazonaws.com/secure.notion-static.com/1091081b-d89e-4a4c-a0f7-a106f0bae663/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220427%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220427T123949Z&X-Amz-Expires=86400&X-Amz-Signature=b11afd03adb67215e3c10550ea3ff405ac88d78f290697a545bdae39da59ff7b&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject"
        alt="Logo"
      />
      <Icons>
        {isLogin ? (
          <>
            <IconBox>
              <Icon
                src="https://s3.us-west-2.amazonaws.com/secure.notion-static.com/329035de-a642-4cfa-93d3-6b815f644493/free-icon-pokeball-361998.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220427%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220427T124807Z&X-Amz-Expires=86400&X-Amz-Signature=37e2d1550b54f8a256718488ce108b0a4057a03d76cdd87da63e31ffbf8773a7&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22free-icon-pokeball-361998.png%22&x-id=GetObject"
                alt="pokedex"
              />
              <IconDesc>내 도감</IconDesc>
            </IconBox>
            <IconBox>
              <Icon
                src="https://s3.us-west-2.amazonaws.com/secure.notion-static.com/52d90fa2-fe58-4be2-b64f-1d172205547c/pokemon-trainer.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220427%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220427T125740Z&X-Amz-Expires=86400&X-Amz-Signature=7b8f55a403e94aa914928f33efc3dd4ce2ac91d1d17cbee1a9a08216e039419e&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22pokemon-trainer.png%22&x-id=GetObject"
                alt="profile"
              />
              <IconDesc>프로필</IconDesc>
            </IconBox>
            <IconBox>
              <Icon
                src="https://s3.us-west-2.amazonaws.com/secure.notion-static.com/7cc5c00b-eff4-411b-bffa-56340d7d9caf/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220427%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220427T125925Z&X-Amz-Expires=86400&X-Amz-Signature=6d76c556a4f26a935ab1a2f9df55a8da3c2cab929acd37e58977b6f163c2e428&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject"
                alt="logout"
              />
              <IconDesc>로그아웃</IconDesc>
            </IconBox>
          </>
        ) : (
          <>
            <IconBox>
              <Icon
                src="https://s3.us-west-2.amazonaws.com/secure.notion-static.com/329035de-a642-4cfa-93d3-6b815f644493/free-icon-pokeball-361998.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220427%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220427T124807Z&X-Amz-Expires=86400&X-Amz-Signature=37e2d1550b54f8a256718488ce108b0a4057a03d76cdd87da63e31ffbf8773a7&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22free-icon-pokeball-361998.png%22&x-id=GetObject"
                alt="pokedex"
              />
              <IconDesc>도감</IconDesc>
            </IconBox>
            <IconBox>
              <Icon
                src="https://s3.us-west-2.amazonaws.com/secure.notion-static.com/98efa7f5-65a9-49aa-8753-8a335683678f/free-icon-pokemon-trainer-287277.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220427%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220427T124735Z&X-Amz-Expires=86400&X-Amz-Signature=e4225b86b612166e67e7966a5f462394993e7dcf1d087a3f0e74446fe60e335f&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22free-icon-pokemon-trainer-287277.png%22&x-id=GetObject"
                alt="login"
              />
              <IconDesc>로그인</IconDesc>
            </IconBox>
          </>
        )}
      </Icons>
    </Head>
  );
}

export default Header;
