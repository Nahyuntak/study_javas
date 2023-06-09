// Methods 적용 전
// import java.util.ArrayList;
// import java.util.HashMap;

// public class MedicalCheckupWithoutDB {
//     public static void main(String[] args) {
//         try {
//             // Medical Checkup Data
//             ArrayList<HashMap<String, String>> MedicalCheckup_table = new ArrayList<HashMap<String, String>>();
//             HashMap<String, String> MedicalCheckup = new HashMap<String, String>();
//             MedicalCheckup.put("이름", "홍길동");
//             MedicalCheckup.put("성별", "남");
//             MedicalCheckup.put("나이", "30");
//             MedicalCheckup.put("키, 체중", "175, 75");
//             MedicalCheckup.put("혈압, 혈당", "120/80, 90");
//             MedicalCheckup.put("검진 결과", "비정상");
//             MedicalCheckup.put("재검진 항목", "폐암, 갑상선 질환");
//             MedicalCheckup_table.add(MedicalCheckup);

//             MedicalCheckup = new HashMap<String, String>();
//             MedicalCheckup.put("이름", "김영희");
//             MedicalCheckup.put("성별", "여");
//             MedicalCheckup.put("나이", "25");
//             MedicalCheckup.put("키, 체중", "160, 55");
//             MedicalCheckup.put("혈압, 혈당", "110/70, 85");
//             MedicalCheckup.put("검진 결과", "비정상");
//             MedicalCheckup.put("재검진 항목", "간암, 뇌졸중");
//             MedicalCheckup_table.add(MedicalCheckup);

//             MedicalCheckup = new HashMap<String, String>();
//             MedicalCheckup.put("이름", "박철수");
//             MedicalCheckup.put("성별", "남");
//             MedicalCheckup.put("나이", "45");
//             MedicalCheckup.put("키, 체중", "180, 85");
//             MedicalCheckup.put("혈압, 혈당", "130/85, 100");
//             MedicalCheckup.put("검진 결과", "정상");
//             MedicalCheckup.put("재검진 항목", "심장질환");
//             MedicalCheckup_table.add(MedicalCheckup);

//             MedicalCheckup = new HashMap<String, String>();
//             MedicalCheckup.put("이름", "이지은");
//             MedicalCheckup.put("성별", "여");
//             MedicalCheckup.put("나이", "35");
//             MedicalCheckup.put("키, 체중", "165, 60");
//             MedicalCheckup.put("혈압, 혈당", "115/75, 95");
//             MedicalCheckup.put("검진 결과", "비정상");
//             MedicalCheckup.put("재검진 항목", "간암, 알츠하이머병");
//             MedicalCheckup_table.add(MedicalCheckup);

//             MedicalCheckup = new HashMap<String, String>();
//             MedicalCheckup.put("이름", "최민호");
//             MedicalCheckup.put("성별", "남");
//             MedicalCheckup.put("나이", "28");
//             MedicalCheckup.put("키, 체중", "170, 70");
//             MedicalCheckup.put("혈압, 혈당", "125/80, 92");
//             MedicalCheckup.put("검진 결과", "정상");
//             MedicalCheckup.put("재검진 항목", "간암");
//             MedicalCheckup_table.add(MedicalCheckup);

//             for (HashMap<String, String> i : MedicalCheckup_table) {
//                 System.out.println(
//                         i.get("이름") + " " +
//                         i.get("성별") + " " +
//                         i.get("나이") + " " +
//                         i.get("키, 체중") + " " +
//                         i.get("혈압, 혈당") + " " +
//                         i.get("검진 결과") + " " +
//                         i.get("재검진 항목")
//                 );
//             }

//             System.out.println();

//         } catch (Exception e) {
//              // TODO: handle exception
//         }
//         // return 0;
//     }
// }



// Methods 적용
import java.util.ArrayList;
import java.util.HashMap;

public class MedicalCheckupWithoutDB {
    public static void main(String[] args) {
        try {
            ArrayList<HashMap<String, String>> MedicalCheckup_table = createMedicalCheckupData();

            printMedicalCheckupData(MedicalCheckup_table);

            System.out.println();

        } catch (Exception e) {
             // TODO: handle exception
        }
        // return 0;
    }

    public static ArrayList<HashMap<String, String>> createMedicalCheckupData() {
        ArrayList<HashMap<String, String>> MedicalCheckup_table = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> MedicalCheckup = new HashMap<String, String>();

        MedicalCheckup.put("이름", "홍길동");
        MedicalCheckup.put("성별", "남");
        MedicalCheckup.put("나이", "30");
        MedicalCheckup.put("키, 체중", "175, 75");
        MedicalCheckup.put("혈압, 혈당", "120/80, 90");
        MedicalCheckup.put("검진 결과", "비정상");
        MedicalCheckup.put("재검진 항목", "폐암, 갑상선 질환");
        MedicalCheckup_table.add(MedicalCheckup);

        MedicalCheckup = new HashMap<String, String>();
        MedicalCheckup.put("이름", "김영희");
        MedicalCheckup.put("성별", "여");
        MedicalCheckup.put("나이", "25");
        MedicalCheckup.put("키, 체중", "160, 55");
        MedicalCheckup.put("혈압, 혈당", "110/70, 85");
        MedicalCheckup.put("검진 결과", "비정상");
        MedicalCheckup.put("재검진 항목", "간암, 뇌졸중");
        MedicalCheckup_table.add(MedicalCheckup);

        MedicalCheckup = new HashMap<String, String>();
        MedicalCheckup.put("이름", "박철수");
        MedicalCheckup.put("성별", "남");
        MedicalCheckup.put("나이", "45");
        MedicalCheckup.put("키, 체중", "180, 85");
        MedicalCheckup.put("혈압, 혈당", "130/85, 100");
        MedicalCheckup.put("검진 결과", "정상");
        MedicalCheckup.put("재검진 항목", "심장질환");
        MedicalCheckup_table.add(MedicalCheckup);

        MedicalCheckup = new HashMap<String, String>();
        MedicalCheckup.put("이름", "이지은");
        MedicalCheckup.put("성별", "여");
        MedicalCheckup.put("나이", "35");
        MedicalCheckup.put("키, 체중", "165, 60");
        MedicalCheckup.put("혈압, 혈당", "115/75, 95");
        MedicalCheckup.put("검진 결과", "비정상");
        MedicalCheckup.put("재검진 항목", "간암, 알츠하이머병");
        MedicalCheckup_table.add(MedicalCheckup);

        MedicalCheckup = new HashMap<String, String>();
        MedicalCheckup.put("이름", "최민호");
        MedicalCheckup.put("성별", "남");
        MedicalCheckup.put("나이", "28");
        MedicalCheckup.put("키, 체중", "170, 70");
        MedicalCheckup.put("혈압, 혈당", "125/80, 92");
        MedicalCheckup.put("검진 결과", "정상");
        MedicalCheckup.put("재검진 항목", "간암");
        MedicalCheckup_table.add(MedicalCheckup);

        return MedicalCheckup_table;
    }

    public static void printMedicalCheckupData(ArrayList<HashMap<String, String>> MedicalCheckup_table) {
        for (HashMap<String, String> i : MedicalCheckup_table) {
            System.out.println(
                    i.get("이름") + " " +
                    i.get("성별") + " " +
                    i.get("나이") + " " +
                    i.get("키, 체중") + " " +
                    i.get("혈압, 혈당") + " " +
                    i.get("검진 결과") + " " +
                    i.get("재검진 항목")
            );
        }
    }
}

