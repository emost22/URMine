const BASE_URL = "http://urmine.site:8080/api/user";

export async function getKakaoLoginPage() {
  const url = await (await fetch(`${BASE_URL}/kakao/page`)).text();
  return url;
}

export async function getToken(code: string) {
  const token = await (
    await fetch(`${BASE_URL}/kakao/login?code=${code}`)
  ).text();
  return token;
}
