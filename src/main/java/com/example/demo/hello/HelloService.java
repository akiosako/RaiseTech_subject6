package com.example.demo.hello;
import org.springframework.stereotype.Service;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class HelloService {

    public HelloService() {
    }

    public String getCurrentTime(){

        //現在の日付と日時を取得
        ZonedDateTime now = ZonedDateTime.now();

        //nowをフォーマット
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern
            ("MM"+ "月" + "dd" + "日" + "yyyy" + "年" + "-" + "HH"+"時"+"mm"+"分"+"ss" +"秒"+"z");

        //戻り値を返す
        return now.format(formatter);
    }

}