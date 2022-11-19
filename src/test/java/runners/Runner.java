package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml" },   // sadece Runner dan calistirilir
        features = "src/test/resources/features",
        glue = "stepDefinitions", //stepDefinitions class'inin yolunu aldip buraya attik
        // isminede glue(yapistirici) dedik
        tags ="@US001_UI",         // Runner class'ndan hangisini calistirmak istersek buraya
        // birden fazla grup çalıstıracaksak "@gp3 or @gp1" yazarız
        dryRun = false       // eksik olan adimlari olusturmasi icin
)

public class Runner {
    /*
     Runner Class'ı TestNG'deki XMl mantığı ile çalışır. Çalıştırmak istediğimiz senaryolara tag belirtiriz
    ve belirttiğimiz tag'ları çalıştırır. XMl deki gibi istediğimiz testleri çalıştırmak için kullanırız.
    Runner class body'si boştur ve runner class'ını ekleyeceğimiz notasyonlar aktive eder.
     Bu class'da kullanacağımız 2 adet notasyon vardır
    -@RunWith(Cucumber.class)  notasyonu Runner class'ına çalışma özelliği ekler.
    Bu notasyon olduğu için Cucumber frameworkumuzde Junit kullanmayı tercih ederiz
    -@CucumberOptions notasyonu içinde
    features : Runeer dosyasının feature dosyasını nereden bulacağını tarif eder
    glue : stepDefinitions yolunu belirtiriz
    tags : Hangi tag'i çalıştırmak istiyorsak onu belli eder

    dryRun : iki seçenek vardır
    dryRun = true; dersek testimizi çalıştırmadan eksik adımları bize verir
    dryRun = false; testlerimizi driver ile çalıştırır.
     */

}

