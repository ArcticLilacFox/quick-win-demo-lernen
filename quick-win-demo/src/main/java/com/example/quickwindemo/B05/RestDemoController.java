package com.example.quickwindemo.B05;

import org.springframework.web.bind.annotation.*;

/**curl -XPOST "localhost:8080" -H "
 Content-Type: application/json" -d '{ "text" : "new" }'
*/

@RestController
public class RestDemoController {

    private Data temp = new Data();

    @GetMapping
    public Data get() { return temp; }

    @PostMapping
    public Data set(@RequestBody Data newData) {
        temp = newData;
        return temp;
    }

    @PutMapping
    public Data add(@RequestBody Data newData) {
        temp.text = newData.text;
        return temp;
    }

    @DeleteMapping
    public Data delete() {
        this.temp = new Data();
        return temp;
    }

    public static class Data {
        public String text;
    }
}
