package ZadaniaPraktyczne;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import static org.assertj.core.api.Assertions.assertThatThrownBy;
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.doThrow;
//
//@ExtendWith(MockitoExtension.class)
//class SmsServiceTest {
//

// wykomentowałam test, ponieważ nie wrzuciłam metody z Worda, oraz nie tworzyłam modelu, a także interfejsu SMSGateway
// z metoda send, na którym jest Mock w teście


//    @Mock
//    private SmsGateway smsGateway;
//
//    @InjectMocks
//    private SmsService smsService;
//
//    @Test
//    void shouldThrowExceptionWhenGatewayIsOverloaded() {
//        //given
//        String numerTel = "500100200";
//        String trescSms = "bla bla bla";
//        Sms sms = new Sms(numerTel, trescSms);
//        doThrow(SMSGatewayException.class).when(smsGateway).send(sms);
//        //when & then
//        assertThatThrownBy(() -> smsService.wyslijSms(numerTel, trescSms))
//                .isInstanceOf(SMSGatewayException.class)
//        .hasMessage("Bramka przeciążona");
//    }
//
//}
