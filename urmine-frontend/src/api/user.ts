const BASE_URL = "http://15.164.97.14:8080/api/user";

export async function getKakaoLoginPage() {
  const url = await (
    await fetch("http://15.164.97.14:8080/api/user/kakao/page")
  ).text();
  return url;
}
