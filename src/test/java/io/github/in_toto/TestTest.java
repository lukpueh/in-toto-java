package io.github.in_toto;
import io.github.in_toto.models.Link;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import org.bouncycastle.util.encoders.Hex;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.migrationsupport.rules.EnableRuleMigrationSupport;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.ExpectedException;
import org.junit.Rule;


class TestTest
{


    @Test
    public void testTest()
    {
        try {
            Path link_path = Paths.get("/Users/lukp/kek/", "build.bb513c2d.link");
            String link_string = new String(Files.readAllBytes(link_path));
            Link link = Link.read(link_string);
            System.out.println(Hex.toHexString(link.signed.environment.get("stdout").getBytes()));
            // System.out.println(Hex.toHexString(link.signed.JSONEncode().getBytes()));

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
