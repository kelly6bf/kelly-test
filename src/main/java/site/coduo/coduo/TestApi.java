package site.coduo.coduo;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class TestApi {

    private final MemberRepository memberRepository;

    @GetMapping("/")
    public String index() {
        return "Hello World with kelly!!";
    }

    @GetMapping("/test")
    public String getTest() {
        return "집에 가고 싶은 켈리의 노래...";
    }

    @PostMapping("/test")
    public String save() {
        final int i = new Random().nextInt();
        final Member hi = new Member("hi" + i);

        System.out.println("이번 타자는... 바로!!!!!!!!");
        System.out.println();
        return memberRepository.save(hi).getName();
    }
}
