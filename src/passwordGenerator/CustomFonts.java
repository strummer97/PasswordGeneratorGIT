package passwordGenerator;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class CustomFonts {

    Font computerPixel7, halfBoldPixel7, quinqueFive, pixelMplus10R;
    CustomFonts() {

        try {
            computerPixel7 = Font.createFont(Font.TRUETYPE_FONT,
                    new File("C:\\Users\\strum\\IdeaProjects\\Password_Generator\\ComputerPixel7-mnL2.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT,
                    new File("C:\\Users\\strum\\IdeaProjects\\Password_Generator\\ComputerPixel7-mnL2.ttf")));
            halfBoldPixel7 = Font.createFont(Font.TRUETYPE_FONT,
                    new File("C:\\Users\\strum\\IdeaProjects\\Password_Generator\\HalfBoldPixel7-2rw3.ttf"));
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT,
                    new File("C:\\Users\\strum\\IdeaProjects\\Password_Generator\\HalfBoldPixel7-2rw3.ttf")));
            quinqueFive = Font.createFont(Font.TRUETYPE_FONT,
                    new File("C:\\Users\\strum\\IdeaProjects\\Password_Generator\\Quinquefive-0Wonv.ttf"));
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT,
                    new File("C:\\Users\\strum\\IdeaProjects\\Password_Generator\\Quinquefive-0Wonv.ttf")));
            pixelMplus10R = Font.createFont(Font.TRUETYPE_FONT,
                    new File("C:\\Users\\strum\\IdeaProjects\\Password_Generator\\PixelMplus10-Regular.ttf"));
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT,
                    new File("C:\\Users\\strum\\IdeaProjects\\Password_Generator\\PixelMplus10-Regular.ttf")));
           } catch (FontFormatException | IOException e) {

        }
    }
}
