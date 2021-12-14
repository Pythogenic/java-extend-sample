import libaries.YoutubeCredentials;
import lombok.Data;

@Data
public class Video extends File {

    private byte[] vidoeData;

    private byte[] audioData;

    public void uploadToYoutube(YoutubeCredentials credentials) {
        //code
    }

}
