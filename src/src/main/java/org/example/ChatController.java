package org.example;

import com.sun.source.util.SourcePositions;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ChatController {
    @PostMapping("/sendMessage")
    @CrossOrigin(origins = "http://localhost:63342")
    public ResponseEntity<Integer> sendMessage(@RequestBody String message) {
        int len = message.length();
        System.out.println(message);
        return ResponseEntity.ok(len);
    }
}
