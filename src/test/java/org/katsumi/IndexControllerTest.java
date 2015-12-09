package org.katsumi;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import org.junit.Test;
import org.loadui.testfx.GuiTest;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.assertThat;
import static org.loadui.testfx.controls.Commons.hasText;

public class IndexControllerTest extends GuiTest
{
    @Override
    protected Parent getRootNode()
    {
        try {
            return FXMLLoader.load(getClass().getResource("index.fxml"));
        }
        catch (IOException e) {
            Logger.getLogger(IndexControllerTest.class.getName()).log(Level.SEVERE, "", e);
            return null;
        }
    }

    @Test
    public void testSay()
    {
        final Node node = find("#button");
        click(node);
        assertThat("#greeting", hasText("Hello World!"));
    }
}
