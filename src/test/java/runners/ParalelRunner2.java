package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-p1.html",
                "json:target/json-reports/cucumberp2.json",
                "junit:target/xml-report/cucumberp2.xml"
        },
        features = "src/test/resources/features" ,
        glue = "stepdefinitions" ,
        tags = "@p2" ,
        dryRun = false
)

public class ParalelRunner2 {
    /*
    Cucumber'da runner class'i bos bir class'tir.
    Runner class'ini diger classlardan farkli kilan ve
    testNG'deki xml dosyalari gibi calismasini saglayan
    2 adet notasyon mevcuttur.

    @RunWith notasyonu projemize Cucumber JUnit dependency eklememizin sebebidir
    bu sayede runner class'larimiz cucumber ile calisir

    @@CucumberOptions notasyonu ile istedigimiz ozellikleri Runner class'ina ekleyebiliriz
    Raporlama gibi ekstra optionlari da ileride ekleyecegiz
    Ancak
    oncelikli gorevi featurs doyalari ile stepdefinicions'da bulunan
    Java methodlarini ilisiklendirmektir.

    tags : features classoru icerisinde yazilan tag(lari) aratip
    buldugu tüm feature veya senario'lari calistirir.

    drtRun : iki deger alabilir
    true : secilirse , verilen tag ile isaretli olan Feature veya
        Senario'daki eksik stepdefinitions'lari bulup ilgili methodlari olusturur
        Hicbir sekilde testimizi calistirmaz
        eksik adim yoksa test passed olarak isaretler
    false : secilirse, verilen tag ile isaretlenen Feature veya
        Senario'lari calistirir

     */
}
