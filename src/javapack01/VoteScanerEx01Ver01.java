package javaPack01;

import java.util.Scanner;

public class VoteScoreV01Ver01 {

   private final static String[] strName = { "김경훈", "김우진", "박지우", "박채림", "신다울", "원병선", "유미희", "이선재", "이승현", "이준석",
         "임성범", "장선애", "전대현", "조연태", "주란", "하현수", "허정현" };

   public static void main(String[] args) {
      int iSelectpeopleCount;

      // 몇명이 투표하게 하는 숫자
      int iLoopCountNumber = 1;

      // 1번째 루프
      iSelectpeopleCount = intputNumber();

      // 투표시작
      int[] iArrayVoteAccum = new int[strName.length];
      String[][] sTwoArrayInputVar = new String[iLoopCountNumber][iSelectpeopleCount];

      // 2번째 루프
      inputName(iLoopCountNumber, iSelectpeopleCount, sTwoArrayInputVar, iArrayVoteAccum);
      
      // 최대 값 구하기 , 투표 순위
      int iArrayVoteRank[] = rankLineUp(iArrayVoteAccum);
      
      // 출력 입력 리스트
      printInputResult(iLoopCountNumber, iSelectpeopleCount, sTwoArrayInputVar);
      
      // 등수 최대값 구하기 , 등수 출력
      printResult(iArrayVoteRank, iArrayVoteAccum);

   }

   public static void mLine(int iRepickCount, String sRepick) {
      for (int i = 0; i < iRepickCount; i++) {
         System.out.print(sRepick);
      }
      System.out.println();

   }

   public static int intScan() {
      Scanner intSC = new Scanner(System.in);
      return intSC.nextInt();

   }

   public static String stringScan() {
      Scanner stringSC = new Scanner(System.in);
      return stringSC.nextLine();

   }

   public static int intputNumber() {
      while (true) {
         System.out.printf("[1 ~ %d] 사이의 숫자를 입력하세요 :" + " ■ 종료 0 ■ \n", strName.length);
         int iSelectpeopleCount = intScan();

         if (iSelectpeopleCount == 0) {
            System.out.println("Bye Bye ~");
            System.exit(0);

         } else if (0 < iSelectpeopleCount && iSelectpeopleCount < (strName.length + 1)) {
            System.out.printf("입력된 값 : %d 명 \n", iSelectpeopleCount);
            return iSelectpeopleCount;

         } else {
            System.out.printf("1 ~ %d 갯수 이하의 정해진 값을 입력하세요 \n", strName.length);
         }
      }
   }

   public static void inputName(int iLoopCountNumber, int iSelectpeopleCount, String[][] sTwoArrayInputVar,
         int[] iArrayVoteAccum) {
      for (int iVoteCount = 0; iVoteCount < iLoopCountNumber; iVoteCount++) {
         mLine(99, "=");
         System.out.println((iVoteCount + 1) + "번째 입력 결과");
         mLine(99, "=");
         for (int iVotePeopleCount = 0; iVotePeopleCount < iSelectpeopleCount; iVotePeopleCount++) {
            exitWhile: while (true) {
               System.out.print((iVotePeopleCount + 1) + "#" + iSelectpeopleCount + " 번째 이름 임력 : ");

               String intputName = stringScan();
               for (int check = 0; check < strName.length; check++) {
                  if (intputName.equals(strName[check])) {
                     sTwoArrayInputVar[iVoteCount][iVotePeopleCount] = strName[check];
                     iArrayVoteAccum[check] = iArrayVoteAccum[check] + 1;
                     break exitWhile;
                  }

               }
               System.out.println("후보자가 DB에 없습니다. 다시 확인 부탁드립니다.");
            }

         }
      }
   }

   public static int maxVarSearch(int[] iArrayList) {
      int iMaxVar = 0;
      for (int iPeopleCount = 0; iPeopleCount < iArrayList.length; iPeopleCount++) {
         if (iArrayList[iPeopleCount] > iMaxVar) {
            iMaxVar = iArrayList[iPeopleCount];
         }
      }
      return iMaxVar;
   }

   public static int[] rankLineUp(int[] iArrayVoteAccum) {
      int iMaxVar = maxVarSearch(iArrayVoteAccum);
      int iVoteRankCount = 1;
      int iVoteRankDownCount = 0;
      int[] iArrayVoteRank = new int[iArrayVoteAccum.length];
      for (int iMaxRank = iMaxVar; iMaxRank >= 0; iMaxRank--) {

         for (int iPeopleCount = 0; iPeopleCount < iArrayVoteAccum.length; iPeopleCount++) {

            if (iMaxRank == iArrayVoteAccum[iPeopleCount]) {
               iArrayVoteRank[iPeopleCount] = iVoteRankCount;
               iVoteRankDownCount++;
            }
         }
         iVoteRankCount = iVoteRankCount + iVoteRankDownCount;
         iVoteRankDownCount = 0;
      }
      return iArrayVoteRank;
   }

   public static void printInputResult(int iLoopCountNumber, int iSelectpeopleCount, String[][] sTwoArrayInputVar) {
      System.out.println("==================결과 확인=====================");
      mLine(99, "-");
      for (int iCount = 0; iCount < iLoopCountNumber; iCount++) {
         System.out.printf("%d번째 입력 : ", iCount + 1);
         for (int iVotePeopleCount = 0; iVotePeopleCount < iSelectpeopleCount; iVotePeopleCount++) {
            System.out.printf("%s ", sTwoArrayInputVar[iCount][iVotePeopleCount]);
         }
         System.out.println();
      }
      mLine(99, "-");
   }

   public static void printResult(int[] iArrayVoteRank, int[] iArrayVoteAccum) {
      int iRankMaxvar = maxVarSearch(iArrayVoteRank);
      for (int iRankCheck = 1; iRankCheck <= iRankMaxvar; iRankCheck++) {
         for (int iPeopleCount = 0; iPeopleCount < iArrayVoteRank.length; iPeopleCount++) {
            if (iArrayVoteRank[iPeopleCount] == iRankCheck) {
               System.out.printf("%d등   %6s   %d번\n", iArrayVoteRank[iPeopleCount], strName[iPeopleCount],
                     iArrayVoteAccum[iPeopleCount]);
            }

         }

      }

   }
}