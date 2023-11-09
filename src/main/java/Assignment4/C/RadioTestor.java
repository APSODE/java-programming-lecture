package Assignment4.C;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class RadioTestor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Radio radio = Radio.createRadio();
        for (int i = 0; i < 3; i++) {
            String stationName = "testStation(" + i + ")";
            radio.addStation(
                RadioStation.createStation(
                    stationName,
                    Program.createProgram(stationName + "'s Radio Program")
                )
            );
        }

        while (true) {
            System.out.println("===== 메뉴 =====");
            if (radio.isPower()) {
                System.out.println("1. 채널 선택");
                System.out.println("2. 현재 시간 수정");
                System.out.println("3. 프로그램 종료");
                int inputCommand = sc.nextInt();

                if (inputCommand == 1) {
                    System.out.print("원하는 채널을 입력하시오 (0 ~ " + (radio.getStations().size() - 1) + ") : ");
                    boolean changeStatus = radio.setCurrentChannel(sc.nextInt());

                    if (changeStatus) {
                        radio.showCurrentOnAirProgram();
                    } else {
                        System.out.println("채널을 다시 입력하십시오.");
                    }
                } else if (inputCommand == 2) {
                    System.out.print("변경을 원하는 시간을 입력하시오 (YYYY-MM-DD-HH) : ");
                    String newTime = sc.nextLine();
                    try {
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd-hh");
                        Calendar newCurrentTime = Calendar.getInstance();
                        newCurrentTime.setTime(sdf.parse(newTime));
                        radio.editCurrentTime(newCurrentTime);

                    } catch (ParseException e) {
                        System.out.println("잘못된 시간 형식입니다. 다시 입력하십시오.");
                    }

                } else if (inputCommand == 3) {
                    break;

                } else {
                    System.out.println("메뉴를 제대로 입력하십시오.");
                }
            } else {
                System.out.println("1. 전원 켜기");
                System.out.println("2. 전원 끄기");
                System.out.println("3. 프로그램 종료");

                int inputCommand = sc.nextInt();
                if (inputCommand == 1) {
                    radio.onPower();
                    System.out.println("전원 켜짐");

                } else if (inputCommand == 2) {
                    radio.offPower();
                    System.out.println("전원 꺼짐");

                } else if (inputCommand == 3) {
                    break;

                } else {
                    System.out.println("메뉴를 제대로 입력하십시오.");
                }
            }
        }
    }
}

