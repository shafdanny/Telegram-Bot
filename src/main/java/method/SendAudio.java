package method;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import utility.FileMessageResource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by shafiq on 29/01/16.
 */
public class SendAudio extends TelegramBotMethod {
    public SendAudio() {
        super("/sendAudio");
    }

    @Override
    public <T> void execute(T... args) throws RuntimeException {
        String chat_id = (String) args[0];

        MultiValueMap<String, Object> map = new LinkedMultiValueMap<String, Object>();
        map.add("chat_id", chat_id);

        Path file = Paths.get("aadc.mp3");
        byte[] fileArray = new byte[0];
        try {
            fileArray = Files.readAllBytes(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        map.add("audio", new FileMessageResource(fileArray, "aadc.mp3"));

        RestTemplate restTemplate = new RestTemplate();

        Object response = restTemplate.postForObject(getFullUrl(), map, Object.class);
    }
}