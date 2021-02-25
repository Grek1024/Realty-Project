package com.example.app_r_project;

import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public class QueryToDatabase {

    public static void inputDate(){

        //First School
        /*******************************************************************************************/
        Building building1 = new Building();
        building1.setAddress("Івано-Франківська область, м. Коломия, вул. Міцкевича, 3");
        building1.setAppointment("Школа");
        building1.setSubordination("Комунальна власність територіальної громади міста Коломиї.");
        building1.setEstimate_documentation("Наявна");
        building1.setYear_construction(1871);
        building1.setRegistration_doс_link("https://if.isuo.org/schools/view/id/10906");
        building1.setArea(7557.3);
        building1.setAccessibility("Пристосована для дітей з особливими потребами");
        building1.setCondition("задовільний");
        building1.setParking_place("Відсутнє");
        building1.setName("КОЛОМИЙСЬКИЙ ЛІЦЕЙ №1 ІМЕНІ В.СТЕФАНИКА КОЛОМИЙСЬКОЇ МІСЬКОЇ РАДИ ІВАНО-ФРАНКІВСЬКОЇ ОБЛАСТІ");
        building1.setCoordinate(48.5230722393805);
        building1.setCoordinateTwo(25.04220239839586);

        new com.example.app_r_project.AsyncTask().execute(building1);
        /*******************************************************************************************/

        //second school

        Building building2 = new Building();
        building2.setAddress("Івано-Франківська область, м. Коломия, вул. Лисенка, 24");
        building2.setAppointment("Школа");
        building2.setSubordination("Комунальна власність територіальної громади міста Коломиї.");
        building2.setEstimate_documentation("Наявна");
        building2.setYear_construction(1964);
        building2.setRegistration_doс_link("https://if.isuo.org/schools/view/id/10907");
        building2.setArea(4339.3);
        building2.setAccessibility("Пристосована для дітей з особливими потребами");
        building2.setCondition("задовільний");
        building2.setParking_place("Відсутнє");
        building2.setName("КОЛОМИЙСЬКИЙ ЛІЦЕЙ №2 КОЛОМИЙСЬКОЇ МІСЬКОЇ РАДИ ІВАНО-ФРАНКІВСЬКОЇ ОБЛАСТІ");
        building2.setCoordinate(48.53524140725038);
        building2.setCoordinateTwo(25.050242231127758);

        new com.example.app_r_project.AsyncTask().execute(building2);

        Building building3 = new Building();
        building3.setAddress("Івано-Франківська область, м.Коломия, вул. Гетьмана Івана Мазепи, 132 А");
        building3.setAppointment("Школа");
        building3.setSubordination("Комунальна власність територіальної громади міста Коломиї.");
        building3.setEstimate_documentation("Наявна");
        building3.setYear_construction(1907);
        building3.setRegistration_doс_link("https://if.isuo.org/schools/view/id/10908");
        building3.setArea(1550.0);
        building3.setAccessibility("Пристосована для дітей з особливими потребами");
        building3.setCondition("задовільний");
        building3.setParking_place("Відсутнє");
        building3.setName("КОЛОМИЙСЬКИЙ ЛІЦЕЙ №3 КОЛОМИЙСЬКОЇ МІСЬКОЇ РАДИ ІВАНО-ФРАНКІВСЬКОЇ ОБЛАСТІ");
        building3.setCoordinate(48.52521273942269);
        building3.setCoordinateTwo(25.056106478027537);

        new com.example.app_r_project.AsyncTask().execute(building3);

        Building building4 = new Building();
        building4.setAddress("Івано-Франківська область, м.Коломия, вул. М. Заньковецької, 11");
        building4.setAppointment("Школа");
        building4.setSubordination("Комунальна власність територіальної громади міста Коломиї.");
        building4.setEstimate_documentation("Наявна");
        building4.setYear_construction(1987);
        building4.setRegistration_doс_link("https://school.isuo.org/school/view?id=10909");
        building4.setArea(10058.0);
        building4.setAccessibility("Пристосована для дітей з особливими потребами");
        building4.setCondition("задовільний");
        building4.setParking_place("Відсутнє");
        building4.setName("КОЛОМИЙСЬКИЙ ЛІЦЕЙ №4 ІМЕНІ СЕРГІЯ ЛИСЕНКА КОЛОМИЙСЬКОЇ МІСЬКОЇ РАДИ ІВАНО-ФРАНКІВСЬКОЇ ОБЛАСТІ");
        building4.setCoordinate(48.52934625972145);
        building4.setCoordinateTwo(25.058587925407586);

        new com.example.app_r_project.AsyncTask().execute(building4);

        Building building5 = new Building();
        building5.setAddress("Івано-Франківська область, м.Коломия, просп. Грушевського, 64");
        building5.setAppointment("Школа");
        building5.setSubordination("Комунальна власність територіальної громади міста Коломиї.");
        building5.setEstimate_documentation("Наявна");
        building5.setYear_construction(1921);
        building5.setRegistration_doс_link("https://opendatabot.ua/c/20560971");
        building5.setArea(5917.6);
        building5.setAccessibility("Пристосована для дітей з особливими потребами");
        building5.setCondition("задовільний");
        building5.setParking_place("Відсутнє");
        building5.setName("КОЛОМИЙСЬКИЙ ЛІЦЕЙ №5 ІМЕНІ Т.Г. ШЕВЧЕНКА КОЛОМИЙСЬКОЇ МІСЬКОЇ РАДИ ІВАНО-ФРАНКІВСЬКОЇ ОБЛАСТІ");
        building5.setCoordinate(48.526425990288466);
        building5.setCoordinateTwo(25.03074587704204);

        new com.example.app_r_project.AsyncTask().execute(building5);

        Building building6 = new Building();
        building6.setAddress("Івано-Франківська область, м.Коломия, вул. Миколи Леонтовича, 14");
        building6.setAppointment("Школа");
        building6.setSubordination("Комунальна власність територіальної громади міста Коломиї.");
        building6.setEstimate_documentation("Наявна");
        building6.setYear_construction(1995);
        building6.setRegistration_doс_link("https://school.isuo.org/school/view?id=10911");
        building6.setArea(10004.2);
        building6.setAccessibility("Пристосована для дітей з особливими потребами");
        building6.setCondition("задовільний");
        building6.setParking_place("Відсутнє");
        building6.setName("КОЛОМИЙСЬКИЙ ЛІЦЕЙ №6 ІМЕНІ ГЕРОЯ УКРАЇНИ ТАРАСА СЕНЮКА КОЛОМИЙСЬКОЇ МІСЬКОЇ РАДИ ІВАНО-ФРАНКІВСЬКОЇ ОБЛАСТІ");
        building6.setCoordinate(48.54333374797062);
        building6.setCoordinateTwo(25.038255686694505);

        new com.example.app_r_project.AsyncTask().execute(building6);

        Building building7 = new Building();
        building7.setAddress("Івано-Франківська область, м.Коломия, вул. Карпатська, 74");
        building7.setAppointment("Школа");
        building7.setSubordination("Комунальна власність територіальної громади міста Коломиї.");
        building7.setEstimate_documentation("Наявна");
        building7.setYear_construction(1873);
        building7.setRegistration_doс_link("https://school.isuo.org/school/view?id=10915");
        building7.setArea(2006.6);
        building7.setAccessibility("Пристосована для дітей з особливими потребами");
        building7.setCondition("задовільний");
        building7.setParking_place("Відсутнє");
        building7.setName("КОЛОМИЙСЬКА ГІМНАЗІЯ №7 КОЛОМИЙСЬКОЇ МІСЬКОЇ РАДИ ІВАНО-ФРАНКІВСЬКОЇ ОБЛАСТІ");
        building7.setCoordinate(48.533453932574915);
        building7.setCoordinateTwo(25.014538133201096);

        new com.example.app_r_project.AsyncTask().execute(building7);

        Building building8 = new Building();
        building8.setAddress("Івано-Франківська область, м.Коломия, вул. Коновальця, 10");
        building8.setAppointment("Школа");
        building8.setSubordination("Комунальна власність територіальної громади міста Коломиї.");
        building8.setEstimate_documentation("Наявна");
        building8.setYear_construction(1896);
        building8.setRegistration_doс_link("https://school.isuo.org/school/view?id=10912");
        building8.setArea(1022.8);
        building8.setAccessibility("Пристосована для дітей з особливими потребами");
        building8.setCondition("задовільний");
        building8.setParking_place("Відсутнє");
        building8.setName("КОЛОМИЙСЬКИЙ ЛІЦЕЙ №8 КОЛОМИЙСЬКОЇ МІСЬКОЇ РАДИ ІВАНО-ФРАНКІВСЬКОЇ ОБЛАСТІ");
        building8.setCoordinate(48.525597382676885);
        building8.setCoordinateTwo(25.04563284296257);

        new com.example.app_r_project.AsyncTask().execute(building8);

        Building building9 = new Building();
        building9.setAddress("Івано-Франківська область, м.Коломия, вул. Драгоманова, 1");
        building9.setAppointment("Школа");
        building9.setSubordination("Комунальна власність територіальної громади міста Коломиї.");
        building9.setEstimate_documentation("Наявна");
        building9.setYear_construction(1945);
        building9.setRegistration_doс_link("https://school.isuo.org/school/view?id=10913");
        building9.setArea(3742.9);
        building9.setAccessibility("Пристосована для дітей з особливими потребами");
        building9.setCondition("задовільний");
        building9.setParking_place("Відсутнє");
        building9.setName("КОЛОМИЙСЬКИЙ ЛІЦЕЙ №9 КОЛОМИЙСЬКОЇ МІСЬКОЇ РАДИ ІВАНО-ФРАНКІВСЬКОЇ ОБЛАСТІ");
        building9.setCoordinate(48.529079249872495);
        building9.setCoordinateTwo(25.039310718019028);

        new com.example.app_r_project.AsyncTask().execute(building9);

        Building building10 = new Building();
        building10.setAddress("Івано-Франківська область, м.Коломия, вул. Січових Стрільців, 30");
        building10.setAppointment("Школа");
        building10.setSubordination("Комунальна власність територіальної громади міста Коломиї.");
        building10.setEstimate_documentation("Наявна");
        building10.setYear_construction(1835);
        building10.setRegistration_doс_link("https://school.isuo.org/school/view?id=10916");
        building10.setArea(1396.9);
        building10.setAccessibility("Пристосована для дітей з особливими потребами");
        building10.setCondition("задовільний");
        building10.setParking_place("Відсутнє");
        building10.setName("КОЛОМИЙСЬКА ГІМНАЗІЯ №10 КОЛОМИЙСЬКОЇ МІСЬКОЇ РАДИ ІВАНО-ФРАНКІВСЬКОЇ ОБЛАСТІ");
        building10.setCoordinate(48.53205584302484);
        building10.setCoordinateTwo(25.047037109301385);

        new com.example.app_r_project.AsyncTask().execute(building10);

        Building building11 = new Building();
        building11.setAddress("Івано-Франківська область, м.Коломия, вул. Івана Франка, 19");
        building11.setAppointment("Школа");
        building11.setSubordination("Комунальна власність територіальної громади міста Коломиї.");
        building11.setEstimate_documentation("Наявна");
        building11.setYear_construction(1892);
        building11.setRegistration_doс_link("https://school.isuo.org/school/view?id=10914");
        building11.setArea(5219.4);
        building11.setAccessibility("Пристосована для дітей з особливими потребами");
        building11.setCondition("задовільний");
        building11.setParking_place("Відсутнє");
        building11.setName("КОЛОМИЙСЬКИЙ ЛІЦЕЙ ІМЕНІ М.ГРУШЕВСЬКОГО КОЛОМИЙСЬКОЇ МІСЬКОЇ РАДИ ІВАНО-ФРАНКІВСЬКОЇ ОБЛАСТІ");
        building11.setCoordinate(48.53120586110037);
        building11.setCoordinateTwo(25.03593951560391);

        new com.example.app_r_project.AsyncTask().execute(building11);

        Building building12 = new Building();
        building12.setAddress("Івано-Франківська область, м.Коломия, вул. Романа Шухевича, 80");
        building12.setAppointment("Музей");
        building12.setSubordination("Комунальна власність територіальної громади міста Коломиї.");
        building12.setEstimate_documentation("Наявна");
        building12.setYear_construction(1990);
        building12.setRegistration_doс_link("https://opendatabot.ua/c/20568027");
        building12.setArea(1103.4);
        building12.setAccessibility("Пристосований для людей з особливими потребами");
        building12.setCondition("задовільний");
        building12.setParking_place("Відсутнє");
        building12.setName("МУЗЕЙ ІСТОРІЇ МІСТА КОЛОМИЇ");
        building12.setCoordinate(48.5284797080331);
        building12.setCoordinateTwo(25.044004958544015);

        new com.example.app_r_project.AsyncTask().execute(building12);

        Building building13 = new Building();
        building13.setAddress("Івано-Франківська область, м.Коломия, вул. Театральна, 25");
        building13.setAppointment("Музей");
        building13.setSubordination("Комунальна власність територіальної громади міста Коломиї.");
        building13.setEstimate_documentation("Наявна");
        building13.setYear_construction(1934);
        building13.setRegistration_doс_link("https://opendatabot.ua/c/02219323");
        building13.setArea(1000.4);
        building13.setAccessibility("Пристосований для людей з особливими потребами");
        building13.setCondition("задовільний");
        building13.setParking_place("Відсутнє");
        building13.setName("НАЦІОНАЛЬНИЙ МУЗЕЙ НАРОДНОГО МИСТЕЦТВА ГУЦУЛЬЩИНИ ТА ПОКУТТЯ ІМЕНІ Й. КОБРИНСЬКОГО");
        building13.setCoordinate(48.52880395765386);
        building13.setCoordinateTwo(25.037710535270907);

        new com.example.app_r_project.AsyncTask().execute(building13);

        Building building14 = new Building();
        building14.setAddress("Івано-Франківська область, м.Коломия, просп. В'ячеслава Чорновола, 43 Б");
        building14.setAppointment("Музей");
        building14.setSubordination("Комунальна власність територіальної громади міста Коломиї.");
        building14.setEstimate_documentation("Наявна");
        building14.setYear_construction(1987);
        building14.setRegistration_doс_link("https://opendatabot.ua/c/02219323");
        building14.setArea(600.0);
        building14.setAccessibility("Пристосований для людей з особливими потребами");
        building14.setCondition("задовільний");
        building14.setParking_place("Відсутнє");
        building14.setName("МУЗЕЙ ПИСАНКОВОГО РОЗПИСУ");
        building14.setCoordinate(48.52832860182597);
        building14.setCoordinateTwo(25.039152864719);

        new com.example.app_r_project.AsyncTask().execute(building14);

        Building building15 = new Building();
        building15.setAddress("Івано-Франківська область, м.Коломия, вул. Родини Крушельницьких, 26");
        building15.setAppointment("Лікарня");
        building15.setSubordination("Комунальна власність територіальної громади міста Коломиї.");
        building15.setEstimate_documentation("Наявна");
        building15.setRegistration_doс_link("https://opendatabot.ua/c/25596594");
        building15.setAccessibility("Пристосована для людей з особливими потребами");
        building15.setCondition("задовільний");
        building15.setParking_place("Присутнє");
        building15.setName("КОМУНАЛЬНЕ НЕКОМЕРЦІЙНЕ ПІДПРИЄМСТВО КОЛОМИЙСЬКА ЦЕНТРАЛЬНА РАЙОННА ЛІКАРНЯ КОЛОМИЙСЬКОЇ МІСЬКОЇ РАДИ");
        building15.setCoordinate(48.523672957561224);
        building15.setCoordinateTwo(25.054208117173133);

        new com.example.app_r_project.AsyncTask().execute(building15);

        Building building16 = new Building();
        building16.setAddress("Івано-Франківська область, м.Коломия, вул. В'ячеслава Чорновола, 32");
        building16.setAppointment("Лікарня");
        building16.setSubordination("Комунальна власність територіальної громади міста Коломиї.");
        building16.setEstimate_documentation("Наявна");
        building16.setRegistration_doс_link("https://opendatabot.ua/c/39007143");
        building16.setAccessibility("Пристосована для людей з особливими потребами");
        building16.setCondition("задовільний");
        building16.setParking_place("Присутнє");
        building16.setName("КОМУНАЛЬНЕ НЕКОМЕРЦІЙНЕ ПІДПРИЄМСТВО КОЛОМИЙСЬКОЇ МІСЬКОЇ РАДИ \"КОЛОМИЙСЬКИЙ МІСЬКИЙ ЦЕНТР ПЕРВИННОЇ МЕДИКО-САНІТАРНОЇ ДОПОМОГИ\"");
        building16.setCoordinate(48.5291115660035);
        building16.setCoordinateTwo(25.040721398554812);
//
        new com.example.app_r_project.AsyncTask().execute(building16);

//        new com.example.app_r_project.AsyncTask().execute(new Building("Школа","School № 2",new Double(48.53524140725038),   new Double(25.050242231127758)));
//        new com.example.app_r_project.AsyncTask().execute(new Building("Школа","Secondary school of I-III degrees №4",
//                new Double(48.52957524336969), new Double(25.05846941634165)));
//        new com.example.app_r_project.AsyncTask().execute(new Building("Лікарня","Central District Hospital",
//                new Double(48.52367227100911), new Double(25.054205999968126)));
//        new com.example.app_r_project.AsyncTask().execute(new Building("Лікарня","Medychnyy Tsentr \"Zdorova Sim'ya\"",
//                new Double(48.526940965658), new Double(25.05931408842597)));
//        new com.example.app_r_project.AsyncTask().execute(new Building("Лікарня","Onkolohichnyy Dyspanser",
//                new Double(48.53374654205958), new Double(25.032757044210772)));
//        new com.example.app_r_project.AsyncTask().execute(new Building("Музей","Pysanka Museum",
//                new Double(48.5283264535765), new Double(25.039151683433275)));
//        new com.example.app_r_project.AsyncTask().execute(new Building("Музей","National Museum of Hutsulshchyna and Pokuttya Folk Arts",
//                new Double(48.52880118840377), new Double(25.037711085075955)));
    }

    public static BitmapDescriptor selectImage(String typeBuild){
        switch (typeBuild){
            case "Школа":
                return BitmapDescriptorFactory.fromResource(R.drawable.school);
            case "Музей":
                return BitmapDescriptorFactory.fromResource(R.drawable.museum);
            case "Лікарня":
                return BitmapDescriptorFactory.fromResource(R.drawable.hospital);
        }
        return null;
    }

}
