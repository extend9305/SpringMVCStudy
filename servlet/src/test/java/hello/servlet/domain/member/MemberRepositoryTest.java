package hello.servlet.domain.member;


import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;


class MemberRepositoryTest {
     MemberRepository memberRepository = MemberRepository.getInstance();

     @AfterEach //test 끝나면 실행되는 로직.
    void afterEach(){
         memberRepository.clearStore();
     }

    @Test
    void save(){
         //given
         Member member = new Member("hello",20);

         //when
        Member saveMember = memberRepository.save(member);

        //then
        Member findMemeber = memberRepository.findById(saveMember.getId());
        assertThat(findMemeber).isEqualTo(saveMember);
    }

    @Test
    void findAll(){
         //given
        Member member1 = new Member("member1", 20);
        Member member2 = new Member("memeber2", 30);
        memberRepository.save(member1);
        memberRepository.save(member2);

        //when
        List<Member>result = memberRepository.findAll();

         //then
        assertThat(result.size()).isEqualTo(2);

        assertThat(result).contains(member1,member2);

    }

}


















