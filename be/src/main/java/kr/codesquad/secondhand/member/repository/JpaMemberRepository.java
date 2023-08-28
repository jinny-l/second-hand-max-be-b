package kr.codesquad.secondhand.member.repository;

import java.util.Optional;
import kr.codesquad.secondhand.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaMemberRepository extends JpaRepository<Member, Long> {

    Optional<Member> findBySignInTypeIdAndEmail(Long signInTypeId, String email);
}
