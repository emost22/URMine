package com.urmine.db.data;

import com.urmine.db.entity.Pokemon;
import com.urmine.db.entity.PokemonType;
import com.urmine.db.repository.PokemonRepository;
import com.urmine.db.repository.PokemonTypeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
public class DataSample {
    static String pokemonNames[] = {" ", "이상해씨", "이상해풀", "이상해꽃", "파이리", "리자드", "리자몽", "꼬부기", "어니부기", "거북왕", "캐터피", "단데기", "버터플", "뿔충이", "딱충이", "독침붕", "구구", "피죤", "피죤투", "꼬렛", "레트라", "깨비참", "깨비드릴조", "아보", "아보크", "피카츄", "라이츄", "모래두지", "고지", "니드런♀", "니드리나", "니드퀸", "니드런♂", "니드리노", "니드킹", "삐삐", "픽시", "식스테일", "나인테일", "푸린", "푸크린", "주뱃", "골뱃", "뚜벅쵸", "냄새꼬", "라플레시아", "파라스", "파라섹트", "콘팡", "도나리", "디그다", "닥트리오", "나옹", "페르시온", "고라파덕", "골덕", "망키", "성원숭", "가디", "윈디", "발챙이", "슈륙챙이", "강챙이", "캐이시", "윤겔라", "후딘", "알통몬", "근육몬", "괴력몬", "모다피", "우츠동", "우츠보트", "왕눈해", "독파리", "꼬마돌", "데구리", "딱구리", "포니타", "날쌩마", "야돈", "야도란", "코일", "레어코일", "파오리", "두두", "두트리오", "쥬쥬", "쥬레곤", "질퍽이", "질뻐기", "셀러", "파르셀", "고오스", "고우스트", "팬텀", "롱스톤", "슬리프", "슬리퍼", "크랩", "킹크랩", "찌리리공", "붐볼", "아라리", "나시", "탕구리", "텅구리", "시라소몬", "홍수몬", "내루미", "또가스", "또도가스", "뿔카노", "코뿌리", "럭키", "덩쿠리", "캥카", "쏘드라", "시드라", "콘치", "왕콘치", "별가사리", "아쿠스타", "마임맨", "스라크", "루주라", "에레브", "마그마", "쁘사이저", "켄타로스", "잉어킹", "갸라도스", "라프라스", "메타몽", "이브이", "샤미드", "쥬피썬더", "부스터", "폴리곤", "암나이트", "암스타", "투구", "투구푸스", "프테라", "잠만보", "프리져", "썬더", "파이어", "미뇽", "신뇽", "망나뇽", "뮤츠", "뮤"};
    static String kinds[] = {" ", "씨앗포켓몬", "씨앗포켓몬", "씨앗포켓몬", "도룡뇽포켓몬", "화염포켓몬", "화염포켓몬", "꼬마거북포켓몬", "거북포켓몬", "껍질포켓몬", "애벌레포켓몬", "번데기포켓몬", "나비포켓몬", "송충이포켓몬", "번데기포켓몬", "독벌포켓몬", "아기새포켓몬", "새포켓몬", "새포켓몬", "쥐포켓몬", "쥐포켓몬", "아기새포켓몬", "부리포켓몬", "뱀포켓몬", "코브라포켓몬", "전기쥐포켓몬", "쥐포켓몬", "쥐포켓몬", "쥐포켓몬", "독침포켓몬", "독침포켓몬", "드릴포켓몬", "독침포켓몬", "독침포켓몬", "드릴포켓몬", "요정포켓몬", "요정포켓몬", "여우포켓몬", "여우포켓몬", "풍선포켓몬", "풍선포켓몬", "박쥐포켓몬", "박쥐포켓몬", "식물포켓몬", "잡초포켓몬", "꽃포켓몬", "버섯포켓몬", "버섯포켓몬", "곤충포켓몬", "독나방포켓몬", "두더지포켓몬", "두더지포켓몬", "요괴고양이포켓몬", "샴고양이포켓몬", "오리포켓몬", "오리포켓몬", "돈숭이포켓몬", "돈숭이포켓몬", "강아지포켓몬", "전설포켓몬", "올챙이포켓몬", "올챙이포켓몬", "올챙이포켓몬", "초능력포켓몬", "초능력포켓몬", "초능력포켓몬", "괴력포켓몬", "괴력포켓몬", "괴력포켓몬", "꽃포켓몬", "파리잡이포켓몬", "파리잡이포켓몬", "해파리포켓몬", "해파리포켓몬", "암석포켓몬", "암석포켓몬", "메가톤포켓몬", "불의말포켓몬", "불의말포켓몬", "얼간이포켓몬", "기생포켓몬", "자석포켓몬", "자석포켓몬", "청둥오리포켓몬", "쌍둥이새포켓몬", "세쌍둥이포켓몬", "강치포켓몬", "강치포켓몬", "진흙포켓몬", "진흙포켓몬", "두조개포켓몬", "두조개포켓몬", "가스포켓몬", "가스포켓몬", "그림자포켓몬", "돌뱀포켓몬", "최면포켓몬", "최면포켓몬", "게포켓몬", "집게포켓몬", "볼포켓몬", "볼포켓몬", "알포켓몬", "야자나무포켓몬", "고독포켓몬", "뼈다귀포켓몬", "킥포켓몬", "펀치포켓몬", "핥기포켓몬", "독가스포켓몬", "독가스포켓몬", "뿔포켓몬", "드릴포켓몬", "알포켓몬", "넝쿨포켓몬", "가족포켓몬", "드래곤포켓몬", "드래곤포켓몬", "금붕어포켓몬", "금붕어포켓몬", "별포켓몬", "수수께끼포켓몬", "배리어포켓몬", "버마재비포켓몬", "인간형태포켓몬", "전기포켓몬", "불뿜기포켓몬", "뿔집게포켓몬", "성난소포켓몬", "물고기포켓몬", "흉악포켓몬", "탈것포켓몬", "변신포켓몬", "진화포켓몬", "거품뿜기포켓몬", "번개포켓몬", "불꽃포켓몬", "가상포켓몬", "소용돌이포켓몬", "소용돌이포켓몬", "껍질포켓몬", "껍질포켓몬", "화석포켓몬", "졸음포켓몬", "냉동포켓몬", "전기포켓몬", "화염포켓몬", "드래곤포켓몬", "드래곤포켓몬", "드래곤포켓몬", "유전포켓몬", "신종포켓몬"};
    static String colors[] = {" ", "#C8E4BE", "#C8E4BE", "#C8E4BE", "#E9AC8F", "#E9AC8F", "#E9AC8F", "#B0E2F3", "#B0E2F3", "#B0E2F3", "#C8E4BE", "#C8E4BE", "#C8E4BE", "#F4D8A1", "#F4D8A1", "#F4D8A1", "#D7B08C", "#D7B08C", "#D7B08C", "#D6B1D3", "#D6B1D3", "#FACAD5", "#FACAD5", "#D6B1D3", "#D6B1D3", "#F7E3A6", "#F7E3A6", "#C8E4BE", "#C8E4BE", "#D4DBEF", "#D4DBEF", "#D4DBEF", "#F0BFD9", "#F0BFD9", "#F0BFD9", "#F9E8EC", "#F9E8EC", "#FCDAC3", "#FCDAC3", "#FCE4E9", "#FCE4E9", "#E6C6DF", "#E6C6DF", "#C8E4BE", "#C8E4BE", "#C8E4BE", "#EFACA6", "#EFACA6", "#EDC3DB", "#EDC3DB", "#DAB3AD", "#DAB3AD", "#F6E5B9", "#F6E5B9", "#B7E3E9", "#B7E3E9", "#F0DDC8", "#F0DDC8", "#F2EBBE", "#F2EBBE", "#BECEEA", "#BECEEA", "#BECEEA", "#F6EEB1", "#F6EEB1", "#F6EEB1", "#D6E4F4", "#D6E4F4", "#D6E4F4", "#D4E7B0", "#D4E7B0", "#D4E7B0", "#C3E7F8", "#C3E7F8", "#D5C29F", "#D5C29F", "#D5C29F", "#F4B0A7", "#F4B0A7", "#FACCD2", "#FACCD2", "#DFF1E5", "#DFF1E5", "#F7F3DC", "#F4B184", "#F4B184", "#EBF6ED", "#EBF6ED", "#CEBED7", "#CEBED7", "#F0B3B5", "#F0B3B5", "#DAB6D6", "#DAB6D6", "#DAB6D6", "#D1D2D5", "#F7DB90", "#F7DB90", "#F3AA96", "#F3AA96", "#F3ABBB", "#F3ABBB", "#F4E783", "#F4E783", "#F2CAA3", "#F2CAA3", "#DDB7B6", "#DDB7B6", "#F9C3D2", "#E3C9E1", "#E3C9E1", "#D3DEF1", "#D3DEF1", "#FACAD5", "#B1BFE2", "#F3DFA6", "#A3D9EF", "#A3D9EF", "#EFABA2", "#EFABA2", "#EEDBA0", "#EEDBA0", "#FCD8DE", "#C7DE87", "#D2BCDB", "#F4DC93", "#FABDB8", "#EAEBEB", "#ECBF95", "#B7E4F3", "#B7E4F3", "#98DAF4", "#D1C7E2", "#FAD6B5", "#C4E8ED", "#F7E5AD", "#FCCCB9", "#F698A5", "#CEECEF", "#CEECEF", "#F6D2B4", "#F6D2B4", "#EEDFEE", "#F2E0B8", "#CBEAF9", "#F7E5A7", "#F9C9C7", "#B1E2F4", "#B1D3F0", "#FADBAF", "#E1DFEF", "#F3ABBB"};
    static String descriptions[] = {" ", "태어났을 때부터 등에 식물의 씨앗이 있으며 조금씩 크게 자란다.", "등에 있는 봉오리가 크게 자라면 두 다리로 설 수 없게 되는 듯하다.", "태양에너지를 양분으로 큰 꽃을 피운다. 양지를 향해 이끌려가듯이 이동한다.", "뜨거운 것을 좋아하는 성격이다. 비에 젖으면 꼬리 끝에서 연기가 난다고 한다.", "불타는 꼬리를 휘두르며 날카로운 발톱으로 상대를 베어 가르는 몹시 거친 성격이다.", "암석도 태워버릴 정도로 작열하는 화염을 뿜어 산불을 일으킬 때가 있다.", "기다란 목을 등껍질 속에 감춘 다음 기세 좋게 물대포를 발사한다.", "장수의 상징으로 여겨진다. 등껍질에 이끼가 붙어 있는 것은 특히 장수한 어니부기다.", "무거운 몸으로 상대를 덮쳐서 기절시킨다. 위기에 처하면 등껍질에 숨는다.", "머리의 더듬이로부터 강렬한 냄새를 내어 적을 물리치고 몸을 보호한다.", "진화를 기다리고 있는 상태다. 단단해지는 것밖에 할 수 없어서 공격받지 않도록 꿈쩍 않고 있다.", "매우 빠르게 날갯짓하면 맹독성의 인분이 바람을 타고 날아간다.", "숲이나 풀밭에 많이 서식한다. 머리끝에 5cm 정도의 작고 날카로운 독침을 지니고 있다.", "스스로는 거의 움직일 수 없지만 위험할 때는 단단해져서 몸을 보호하고 있는 것 같다.", "양손과 엉덩이에 있는 3개의 독침으로 상대를 찌르고 찌르고 또 찌르며 공격한다.", "숲이나 수풀에 많이 분포해 있다. 땅에서도 격렬한 날갯짓으로 모래를 뿌리기도 한다.", "발톱이 발달해 있다. 먹이인 아라리를 잡아 100km 떨어져 있는 둥지까지 나른다.", "먹이를 찾을 때 수면을 아슬아슬하게 미끄러지듯 날아 잉어킹 등을 움켜잡는다.", "앞니는 죽을 때까지 계속 자라기 때문에 관리가 필요하다. 이갈이 용품을 준비하지 않으면 기둥을 갉는다.", "수영이 특기. 뒷발에 작은 물갈퀴가 달려있어 강 때로는 바다를 건너기도 한다.", "날개가 짧아 나는 것이 서툴다. 쉴 새 없이 움직이며 풀숲의 벌레포켓몬을 쪼아대고 있다.", "터프하고 지구력도 우수하다. 무거운 짐을 진 채 온종일 날아도 끄떡없다.", "성장할수록 점점 길어진다. 밤에는 나뭇가지에 몸을 돌돌 말고 쉰다.", "배의 무늬가 무서운 얼굴로 보인다. 약한 적은 그 무늬만 보고도 도망치고 만다.", "만들어 내는 전기가 강력한 피카츄일수록 볼의 주머니가 부드럽고 잘 늘어난다.", "긴 꼬리가 어스가 되어 몸을 지키기 때문에 자신은 고전압에도 마비되지 않는다.", "건조한 모래땅에서 모래를 끼얹는 것을 좋아한다. 몸에 붙은 지저분한 것들을 떨어뜨리고 물기를 없애는 것이다.", "습도가 낮은 땅에서 사는 고지일수록 등에 난 가시의 감촉은 단단하고 매끄럽다.", "몸은 작지만 독침을 지니고 있기 때문에 주의가 필요하다. 암컷의 뿔이 더 작다.", "암컷으로 성격은 온화하다. 입에서 내보내는 초음파는 상대를 혼란시키는 힘이 있다.", "비늘로 뒤덮인 튼튼한 몸으로 둥지의 입구를 막아 상대로부터 새끼들을 지킨다.", "풀밭 위로 귀만 내어 주위의 낌새를 살핀다. 맹독의 뿔로 몸을 보호한다.", "발달한 귀를 세워 주위의 낌새를 살핀다. 무슨 일이 생기면 바로 덤벼든다.", "돌처럼 딱딱한 피부와 길게 뻗은 뿔이 특징이다. 뿔에는 독이 있으니 주의해야 한다.", "보름달 밤에 삐삐가 모여 춤을 추는 모습을 보면 행복해진다고 전해진다.", "요정의 동료로 좀처럼 사람 앞에 나타나지 않는다. 기척을 느끼면 바로 도망가는 듯하다.", "어리지만 6개의 꼬리가 아름답다. 성장하면 한층 꼬리 수가 늘어난다.", "꼬리 하나하나에 신통력이 담겨 있다. 1000년을 산다고 한다.", "폐활량은 포켓몬 중에서도 톱클래스다. 상대가 잠들 때까지 자장가를 계속 부른다.", "숨을 들이쉬면 쉴수록 몸이 부푼다. 기분이 나빠지면 몸을 커다랗게 부풀려 상대에게 위압을 가한다.", "낮에는 동굴에서 자고 있다. 눈이 없어서 초음파로 주변을 확인하면서 날아다닌다.", "두꺼운 이빨은 빨대처럼 속이 비어있어 의외로 약하다. 피를 빠는데 특화된 것이다.", "달빛을 받아 움직인다. 밤중에 씨앗을 여기저기 뿌리기 위해 돌아다닌다.", "암술에서 내뿜는 지독하게 구린 냄새는 2km 떨어진 곳까지 퍼져 정신을 잃게 만든다.", "세계에서 제일 큰 꽃잎은 걸을 때마다 흔들려 대량의 독 꽃가루를 흩뿌린다.", "먹어도 먹어도 등에 돋아나 있는 버섯이 대부분의 영양을 빼앗아간다.", "큰 버섯이 파라섹트를 조종하고 있다. 자주 마셰이드와 영역싸움을 하고 있다.", "작은 눈이 많이 모여 큰 눈을 이루고 있다. 밤이 되면 불빛을 향해 모여든다.", "흩뿌려진 날개 가루에 닿으면 몸의 감각이 이상해져서 똑바로 서 있을 수 없게 된다.", "디그다가 지나간 뒤의 대지는 알맞게 땅이 일궈져 최고의 밭이 된다.", "팀워크가 뛰어난 세쌍둥이 디그다. 지하 100km까지 파고들어 지진을 일으킬 때도 있다.", "빛나는 물건을 모으는 것을 좋아한다. 기분이 좋을 때는 트레이너에게도 컬렉션을 보여준다.", "자존심이 세서 길들이기 힘들다. 마음에 들지 않는 일이 있으면 바로 발톱을 세운다.", "언제나 두통에 시달린다. 신비한 힘을 폭발시키면 잠시 통증이 진정되는 듯하다.", "잔잔히 흐르는 강에 산다. 긴 팔다리로 물을 헤치며 우아하게 헤엄친다.", "예고 없이 갑자기 화낸다. 마구 난동을 부려 모두가 곁을 떠나면 고독을 참지 못하고 또 화낸다.", "너무 화를 내서 그대로 사망하는 경우가 있을 정도지만 죽은 후의 얼굴은 매우 평온하다.", "자신보다 강하고 큰 상대라도 겁 없이 맞서는 용감하고 믿음직스런 성격이다.", "하루 만에 10000km의 거리를 달리는 모습은 많은 사람을 매료시켜 왔다.", "걷기보다 헤엄치기가 특기다. 배의 소용돌이 모양은 내장의 일부가 비쳐 보이는 것이다.", "배의 소용돌이를 계속 보다 보면 잠이 온다. 자장가 대용으로 아이를 재울 때도 사용한다.", "전신이 근육 덩어리다. 추운 바다에서도 늠름한 팔로 유빙을 부수며 힘차게 나아간다.", "자면서 초능력을 구사한다. 꿈의 내용이 사용하는 힘에 영향을 준다.", "사이코 파워로 공중에 떠서 잠든다. 탄력이 뛰어난 꼬리를 베개 대신으로 사용한다.", "매우 높은 지능을 지녔다. 태어나서 죽을 때까지 일어나는 일을 모두 기억한다고 한다.", "몸집은 어린아이만 하지만 온몸이 근육으로 되어 있어서 어른 100명은 날려 버릴 수 있다.", "엄청나게 강한 육체를 지녔기 때문에 파워 세이브 벨트를 차서 힘을 제어하고 있다.", "4개의 팔을 재빠르게 움직여서 모든 각도에서 쉬지 않고 펀치와 당수를 날린다.", "홀쭉한 체격이지만 먹이를 잡을 때의 움직임은 눈에 보이지 않을 정도로 빠르다.", "잎사귀 부분은 칼날이 되어 상대를 베어버린다. 입에서는 무엇이든 녹이는 액체를 뿜어낸다.", "정글의 안쪽에 우츠보트만 있는 지대가 있어서 한 번 가면 두 번 다시 돌아올 수 없다.", "헤엄치는 힘은 강하지 않다. 얕은 바다 수면을 떠다니면서 먹이를 찾는다.j", "머리의 빨간 구슬이 밝게 빛나면 주의가 필요하다. 초음파를 발산하려는 전조다.", "동글고 들기 쉽지만 서로 던지기에는 딱딱하고 무겁다. 눈싸움처럼 서로 맞히며 놀기에는 위험하다.", "이끼가 낀 바위를 아주 좋아한다. 어적어적 소리를 내면서 1일 1톤 이상을 먹는다.", "다이너마이트로 폭파해도 상처 하나 입지 않는 몸이지만 습기나 비는 아주 싫어한다.", "갓 태어났을 때는 달리는 것이 서툴다. 동료와 달리기 경주를 하는 사이에 하반신이 튼튼하게 성장한다.", "불타는 갈기를 휘날리며 시속 240km의 속도로 넓은 초원을 달려나간다.", "멍청하고 둔감하다. 꼬리를 먹혀도 아픔을 느끼지 못하고 꼬리가 다시 자라도 눈치채지 못한다.", "셀러에게 꼬리를 물려서 진화했다. 셀러는 꼬리에서 배어 나오는 단맛에 황홀한 기분이다.", "체내의 전기가 끊겨 땅에서 뒹굴기도 한다. 전지를 주면 움직이기 시작한다.", "3마리의 코일이 연결되었다. 강력한 전파를 발산해 주위의 상황을 관측한다.", "날개로 쥐고 있는 파 줄기를 칼처럼 휘둘러 상대를 베어버린다. 몹시 허기질 때는 먹기도 한다.", "돌연변이로 발견된 두 개의 머리를 지닌 포켓몬이다. 시속 100km로 달린다.", "3개의 머리가 보고 있는 앞에서 조금이라도 빈틈을 보이면 부리로 격렬하게 쪼아댄다.", "빙산에 사는 포켓몬이다. 머리의 뾰족하게 돌출된 부분으로 얼음을 깨고 바다를 헤엄친다.", "전신이 새하얀 털로 뒤덮여 있다. 추위에 강해서 오히려 추울수록 힘이 넘쳐 난다.", "공장에서 흘러나오는 오물 폐수가 주요 먹이다. 최근에는 수가 줄어들고 있다.", "코를 찌를 정도로 지독한 냄새가 난다. 하지만 오히려 그 냄새가 좋다는 질뻐기 마니아도 일부 존재한다.", "2개의 껍질을 여닫아서 뒤쪽으로 헤엄친다. 그 스피드는 제법 빠르다.", "껍데기가 상당히 단단하여 네이팜탄으로도 부술 수 없다. 공격할 때만 연다.", "가스에서 태어난 생명체다. 독을 포함한 가스의 몸에 둘러싸이면 누구든지 기절한다.", "가스로 된 혀에 닿게 되면 몸의 떨림이 멈추지 않게 되어 결국에는 죽음에 이른다고 전해진다.", "보름달이 뜬 밤에 그림자가 멋대로 움직이면서 웃는다면 팬텀의 소행임이 틀림없다.", "땅속을 파고들면서 여러 가지 단단한 것들을 집어삼켜서 튼튼한 몸을 만든다.", "꿈을 먹으며 살아가는 포켓몬이다. 몽나나 몽얌나와 선조가 같다고 여겨지고 있다.", "상당히 위험한 포켓몬이지만 편안한 잠을 원하는 사람들에게는 구세주로 불리고 있다.", "바다 근처에서 발견된다. 커다란 집게는 뜯겨도 나중에 다시 자라난다.", "단단한 집게는 1만 마력의 파워를 지녔지만 너무 커서 움직임이 둔하다.", "몬스터볼이 팔리기 시작했을 때와 같은 시기에 발견되었다. 뭔가 관계가 있다고 전해진다.", "작은 자극에도 반응해서 폭발한다. 폭탄볼이라 불리며 두려움의 대상이 되고 있다.", "알처럼 보이지만 엄연한 포켓몬이다. 텔레파시로 동료와 교신하는 듯하다.", "3개의 머리는 서로 다른 생각을 하고 있다. 자신 외에는 별로 흥미가 없는 듯하다.", "죽은 어머니를 떠올리며 울면 머리에 쓴 뼈 안에서 울음소리가 구슬프게 퍼진다.", "슬픔을 극복하고 늠름하게 진화했다. 뼈를 무기 삼아 용감하게 적과 맞서 싸운다.", "훌륭한 밸런스 감각으로 어떤 자세라도 연속 킥을 날리는 대단한 녀석이다.", "주변의 공기를 가르는 펀치. 스치기만 해도 화상을 입을 정도로 펀치 스피드가 매우 빠르다.", "끈적끈적한 타액에 접촉한 후 그대로 방치하면 굉장히 가렵고 급기야 멈출 수 없게 된다.", "독가스로 몸 안이 가득 차 있다. 음식물 쓰레기의 악취에 이끌려 쓰레기장을 찾아간다.", "2개의 몸에서 가스를 섞는다. 과거의 가라르에서는 흔하게 볼 수 있었다고 한다.", "머리는 나쁘지만 힘이 세서 고층 빌딩도 몸통박치기로 산산조각 낸다.", "진화하여 뒷다리만으로 서게 되었다. 뿔로 찌르면 암석에도 구멍이 뚫리고 만다.", "알은 영양 만점에 맛도 뛰어나다. 고급 식재료로 취급된다.", "잘려도 잘려도 무한으로 늘어나는 덩굴 속의 정체는 아직 밝혀지지 않았다.", "배의 주머니에 새끼가 있지만 발놀림은 매우 가볍다. 재빠른 잽으로 상대를 위협한다.", "잔잔하게 흐르는 고요한 바다에 산다. 습격당하면 새까만 먹물을 내뿜고 그 틈에 도망친다.", "수컷이 새끼를 기른다. 새끼를 기르는 동안 등에 난 가시의 독소는 강해지고 짙어진다.", "등, 가슴, 꼬리지느러미가 우아하게 나부끼기 때문에 물의 무희라고 불린다.", "가을이 되면 짝짓기를 위해 몸에 윤기가 돌게 되며 매우 아름다운 색으로 변화한다.", "늦여름 해변에 가면 규칙적인 리듬으로 빛나는 별가사리의 무리를 볼 수 있다.", "강렬한 사이코 파워를 발산할 때 코어라고 불리는 기관이 일곱 색깔로 빛난다.", "커다란 손바닥은 팬터마임을 하기 위해 발달했다고 생각하는 학자도 많다.", "싸움을 거듭하면서 낫은 점점 더 날카로워진다. 거목도 일도양단으로 베어 가른다.", "허리를 흔드는 듯이 걷고 있다. 방심하면 엉겁결에 따라서 춤춰버린다고 한다.", "갑자기 일어나는 정전의 반은 에레브가 발전소에 모여 전기를 마구 먹어대기 때문이다.", "피곤하면 화구에 뛰어들어 마그마에 잠겨 몸을 치유한다. 전신이 1200도로 타고 있다.", "뿔로 서로의 등급을 매긴다. 굵고 훌륭한 뿔을 가진 쁘사이저일수록 이성에게 인기다.", "꼬리로 자신의 몸을 때리기 시작하면 위험하다. 맹렬한 스피드로 덤벼든다.", "힘도 스피드도 거의 없다. 세상에서 가장 약하고 한심한 포켓몬이다.", "성격이 매우 흉포하다. 입에서 나오는 파괴광선은 모든 것을 태워버린다.", "영리하고 마음 착한 포켓몬. 아름다운 소리로 노래 부르며 바다 위를 헤엄친다.", "전신의 세포를 재구성해서 본 것과 똑 닮게 변신하지만 힘이 빠지면 원래대로 돌아간다.", "주위의 환경에 맞춰서 몸의 구조를 바꿔나가는 능력의 소유자다.", "샤미드의 모든 지느러미가 조금씩 떨리기 시작했다면 몇 시간 뒤에 비가 내린다는 표시다.", "화가 나거나 놀라면 전신의 털이 바늘처럼 곤두서서 상대를 꿰뚫는다.", "체내에 불꽃이 쌓이면 부스터의 체온도 최고 900도까지 오른다.", "최고의 과학 기술을 사용해 세계에서 처음으로 프로그래밍되어 만들어진 인공 포켓몬이다.", "먼 옛날 바다에서 살고 있던 고대 포켓몬. 10개의 다리를 구불거리며 헤엄친다.", "촉수가 팔다리처럼 발달해 있다. 달라붙자마자 문다.", "3억 년 전에 모래 해변에서 살고 있었던 것으로 추측된다. 단단한 껍질이 몸을 보호한다.", "수중을 이동할 때 손발을 작게 접고 등껍질을 구부려 빠르게 헤엄친다.", "공룡시대의 포켓몬이다. 톱 같은 엄니로 먹이를 찢어서 먹었다.", "하루에 400kg의 음식을 먹지 않으면 성에 차지 않는다. 다 먹으면 잠이 들어 버린다.", "전설의 새포켓몬이다. 공기 중의 수분을 얼려 눈보라를 만들어 낼 수 있다.", "구름 위에서 거대한 번개를 내리치며 나타난다. 전설의 새포켓몬이다.", "오래전부터 불새의 전설로 알려져 있다. 날갯짓할 때마다 날개가 눈부시게 불타올라서 아름답다.", "탈피를 반복하며 커진다. 허물을 다듬어서 만든 부츠는 최고급품이다.", "수정 같은 구슬에는 날씨를 조종하는 힘이 숨겨져 있다고 전해진다.", "조난당한 남자가 도움을 받아 따라간 외딴섬은 망나뇽만의 낙원이었다.", "한 과학자가 몇 년에 걸쳐 무서운 유전자의 연구를 계속한 결과 탄생했다.", "모든 기술을 사용하기 때문에 포켓몬의 조상이라고 생각하는 학자가 많다."};
    static Boolean isEvolutions[] = {false, true, true, false, true, true, false, true, true, false, true, true, false, true, true, false, true, true, false, true, false, true, false, true, false, true, false, true, false, true, true, false, true, true, false, true, false, true, false, true, false, true, false, true, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, false, true, true, false, true, true, false, true, true, false, true, true, false, true, false, true, true, false, true, false, true, false, true, false, false, true, false, true, false, true, false, true, false, true, true, false, false, true, false, true, false, true, false, true, false, true, false, false, false, false, true, false, true, false, false, false, false, true, false, true, false, true, false, false, false, false, false, false, false, false, true, false, false, false, true, false, false, false, false, true, false, true, false, false, false, false, false, false, true, true, false, false, false};
    static ArrayList<String> pokemonTypeList[] = new ArrayList[152];

    static Pokemon pokemon = new Pokemon();

    @Autowired
    PokemonRepository pokemonRepository;
    @Autowired
    PokemonTypeRepository pokemonTypeRepository;

    @Test
    void 포켓몬_데이터_생성() {
        for (Long id = 1L; id <= 151; id++) {
            pokemon.setPokemonId(id);
            pokemon.setPokemonName(pokemonNames[id.intValue()]);
            pokemon.setKind(kinds[id.intValue()]);
            pokemon.setColor(colors[id.intValue()]);
            pokemon.setDescription(descriptions[id.intValue()]);
            pokemon.setIsEvolution(isEvolutions[id.intValue()]);

            pokemonRepository.save(pokemon);
        }
    }

    @Test
    void 포켓몬_타입_생성() {
        for (int i = 1; i <= 151; i++) pokemonTypeList[i] = new ArrayList<>();
        pokemonTypeList[1].add("풀");
        pokemonTypeList[1].add("독");
        pokemonTypeList[2].add("풀");
        pokemonTypeList[2].add("독");
        pokemonTypeList[3].add("풀");
        pokemonTypeList[3].add("독");
        pokemonTypeList[4].add("불꽃");
        pokemonTypeList[5].add("불꽃");
        pokemonTypeList[6].add("불꽃");
        pokemonTypeList[6].add("비행");
        pokemonTypeList[7].add("물");
        pokemonTypeList[8].add("물");
        pokemonTypeList[9].add("물");
        pokemonTypeList[10].add("벌레");
        pokemonTypeList[11].add("벌레");
        pokemonTypeList[12].add("벌레");
        pokemonTypeList[12].add("비행");
        pokemonTypeList[13].add("벌레");
        pokemonTypeList[13].add("독");
        pokemonTypeList[14].add("벌레");
        pokemonTypeList[14].add("독");
        pokemonTypeList[15].add("벌레");
        pokemonTypeList[15].add("독");
        pokemonTypeList[16].add("노말");
        pokemonTypeList[16].add("비행");
        pokemonTypeList[17].add("노말");
        pokemonTypeList[17].add("비행");
        pokemonTypeList[18].add("노말");
        pokemonTypeList[18].add("비행");
        pokemonTypeList[19].add("노말");
        pokemonTypeList[20].add("노말");
        pokemonTypeList[21].add("노말");
        pokemonTypeList[21].add("비행");
        pokemonTypeList[22].add("노말");
        pokemonTypeList[22].add("비행");
        pokemonTypeList[23].add("독");
        pokemonTypeList[24].add("독");
        pokemonTypeList[25].add("전기");
        pokemonTypeList[26].add("전기");
        pokemonTypeList[27].add("땅");
        pokemonTypeList[28].add("땅");
        pokemonTypeList[29].add("독");
        pokemonTypeList[30].add("독");
        pokemonTypeList[31].add("독");
        pokemonTypeList[31].add("땅");
        pokemonTypeList[32].add("독");
        pokemonTypeList[33].add("독");
        pokemonTypeList[34].add("독");
        pokemonTypeList[34].add("땅");
        pokemonTypeList[35].add("노말");
        pokemonTypeList[36].add("노말");
        pokemonTypeList[37].add("불꽃");
        pokemonTypeList[38].add("불꽃");
        pokemonTypeList[39].add("노말");
        pokemonTypeList[40].add("노말");
        pokemonTypeList[41].add("독");
        pokemonTypeList[41].add("비행");
        pokemonTypeList[42].add("독");
        pokemonTypeList[42].add("비행");
        pokemonTypeList[43].add("풀");
        pokemonTypeList[43].add("독");
        pokemonTypeList[44].add("풀");
        pokemonTypeList[44].add("독");
        pokemonTypeList[45].add("풀");
        pokemonTypeList[45].add("독");
        pokemonTypeList[46].add("벌레");
        pokemonTypeList[46].add("풀");
        pokemonTypeList[47].add("벌레");
        pokemonTypeList[47].add("풀");
        pokemonTypeList[48].add("벌레");
        pokemonTypeList[48].add("독");
        pokemonTypeList[49].add("벌레");
        pokemonTypeList[49].add("독");
        pokemonTypeList[50].add("땅");
        pokemonTypeList[51].add("땅");
        pokemonTypeList[52].add("노말");
        pokemonTypeList[53].add("노말");
        pokemonTypeList[54].add("물");
        pokemonTypeList[55].add("물");
        pokemonTypeList[56].add("격투");
        pokemonTypeList[57].add("격투");
        pokemonTypeList[58].add("불꽃");
        pokemonTypeList[59].add("불꽃");
        pokemonTypeList[60].add("물");
        pokemonTypeList[61].add("물");
        pokemonTypeList[62].add("물");
        pokemonTypeList[62].add("격투");
        pokemonTypeList[63].add("에스퍼");
        pokemonTypeList[64].add("에스퍼");
        pokemonTypeList[65].add("에스퍼");
        pokemonTypeList[66].add("격투");
        pokemonTypeList[67].add("격투");
        pokemonTypeList[68].add("격투");
        pokemonTypeList[69].add("풀");
        pokemonTypeList[69].add("독");
        pokemonTypeList[70].add("풀");
        pokemonTypeList[70].add("독");
        pokemonTypeList[71].add("풀");
        pokemonTypeList[71].add("독");
        pokemonTypeList[72].add("물");
        pokemonTypeList[72].add("독");
        pokemonTypeList[73].add("물");
        pokemonTypeList[73].add("독");
        pokemonTypeList[74].add("바위");
        pokemonTypeList[74].add("땅");
        pokemonTypeList[75].add("바위");
        pokemonTypeList[75].add("땅");
        pokemonTypeList[76].add("바위");
        pokemonTypeList[76].add("땅");
        pokemonTypeList[77].add("불꽃");
        pokemonTypeList[78].add("불꽃");
        pokemonTypeList[79].add("물");
        pokemonTypeList[79].add("에스퍼");
        pokemonTypeList[80].add("물");
        pokemonTypeList[80].add("에스퍼");
        pokemonTypeList[81].add("전기");
        pokemonTypeList[82].add("전기");
        pokemonTypeList[83].add("노말");
        pokemonTypeList[83].add("비행");
        pokemonTypeList[84].add("노말");
        pokemonTypeList[84].add("비행");
        pokemonTypeList[85].add("노말");
        pokemonTypeList[85].add("비행");
        pokemonTypeList[86].add("물");
        pokemonTypeList[87].add("물");
        pokemonTypeList[87].add("얼음");
        pokemonTypeList[88].add("독");
        pokemonTypeList[89].add("독");
        pokemonTypeList[90].add("물");
        pokemonTypeList[91].add("물");
        pokemonTypeList[91].add("얼음");
        pokemonTypeList[92].add("고스트");
        pokemonTypeList[92].add("독");
        pokemonTypeList[93].add("고스트");
        pokemonTypeList[93].add("독");
        pokemonTypeList[94].add("고스트");
        pokemonTypeList[94].add("독");
        pokemonTypeList[95].add("바위");
        pokemonTypeList[95].add("땅");
        pokemonTypeList[96].add("에스퍼");
        pokemonTypeList[97].add("에스퍼");
        pokemonTypeList[98].add("물");
        pokemonTypeList[99].add("물");
        pokemonTypeList[100].add("전기");
        pokemonTypeList[101].add("전기");
        pokemonTypeList[102].add("풀");
        pokemonTypeList[102].add("에스퍼");
        pokemonTypeList[103].add("풀");
        pokemonTypeList[103].add("에스퍼");
        pokemonTypeList[104].add("땅");
        pokemonTypeList[105].add("땅");
        pokemonTypeList[106].add("격투");
        pokemonTypeList[107].add("격투");
        pokemonTypeList[108].add("노말");
        pokemonTypeList[109].add("독");
        pokemonTypeList[110].add("독");
        pokemonTypeList[111].add("땅");
        pokemonTypeList[111].add("바위");
        pokemonTypeList[112].add("땅");
        pokemonTypeList[112].add("바위");
        pokemonTypeList[113].add("노말");
        pokemonTypeList[114].add("풀");
        pokemonTypeList[115].add("노말");
        pokemonTypeList[116].add("물");
        pokemonTypeList[117].add("물");
        pokemonTypeList[118].add("물");
        pokemonTypeList[119].add("물");
        pokemonTypeList[120].add("물");
        pokemonTypeList[121].add("물");
        pokemonTypeList[121].add("에스퍼");
        pokemonTypeList[122].add("에스퍼");
        pokemonTypeList[123].add("벌레");
        pokemonTypeList[123].add("비행");
        pokemonTypeList[124].add("얼음");
        pokemonTypeList[124].add("에스퍼");
        pokemonTypeList[125].add("전기");
        pokemonTypeList[126].add("불꽃");
        pokemonTypeList[127].add("벌레");
        pokemonTypeList[128].add("노말");
        pokemonTypeList[129].add("물");
        pokemonTypeList[130].add("물");
        pokemonTypeList[130].add("비행");
        pokemonTypeList[131].add("물");
        pokemonTypeList[131].add("얼음");
        pokemonTypeList[132].add("노말");
        pokemonTypeList[133].add("노말");
        pokemonTypeList[134].add("물");
        pokemonTypeList[135].add("전기");
        pokemonTypeList[136].add("불꽃");
        pokemonTypeList[137].add("노말");
        pokemonTypeList[138].add("바위");
        pokemonTypeList[138].add("물");
        pokemonTypeList[139].add("바위");
        pokemonTypeList[139].add("물");
        pokemonTypeList[140].add("바위");
        pokemonTypeList[140].add("물");
        pokemonTypeList[141].add("바위");
        pokemonTypeList[141].add("물");
        pokemonTypeList[142].add("바위");
        pokemonTypeList[142].add("비행");
        pokemonTypeList[143].add("노말");
        pokemonTypeList[144].add("얼음");
        pokemonTypeList[144].add("비행");
        pokemonTypeList[145].add("전기");
        pokemonTypeList[145].add("비행");
        pokemonTypeList[146].add("불꽃");
        pokemonTypeList[146].add("비행");
        pokemonTypeList[147].add("드래곤");
        pokemonTypeList[148].add("드래곤");
        pokemonTypeList[149].add("드래곤");
        pokemonTypeList[149].add("비행");
        pokemonTypeList[150].add("에스퍼");
        pokemonTypeList[151].add("에스퍼");

        for (Long id = 1L; id <= 151L; id++) {
            for (int j = 0; j < pokemonTypeList[id.intValue()].size(); j++) {
                Pokemon pokemon = pokemonRepository.findById(id).orElse(null);

                PokemonType pokemonType = new PokemonType();
                pokemonType.setPokemon(pokemon);
                pokemonType.setTypeNumber(j + 1);
                pokemonType.setPokemonType(pokemonTypeList[id.intValue()].get(j));
                pokemonTypeRepository.save(pokemonType);
            }
        }
    }
    // TODO Add more
}
