package kr.gyuna.interview.introduction.adapter.in.web;

import kr.gyuna.interview.common.response.DefaultResponse;
import kr.gyuna.interview.introduction.adapter.in.web.request.CreateIntroductionReq;
import kr.gyuna.interview.introduction.application.port.in.CreateIntroductionCommand;
import kr.gyuna.interview.introduction.application.port.in.CreateIntroductionUseCase;
import kr.gyuna.interview.introduction.domain.UserId;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CreateIntroductionController {

    private final CreateIntroductionUseCase createIntroductionUseCase;

    @PostMapping("/v1/introductions")
    public ResponseEntity<DefaultResponse> createIntroduction(
            @RequestBody CreateIntroductionReq req
    ) {
        CreateIntroductionCommand command = CreateIntroductionCommand.builder()
                .userId(UserId.of(req.getUserId()))
                .companyName(req.getCompanyName())
                .introductionContent(req.getContent())
                .build();

        DefaultResponse response = createIntroductionUseCase
                .createIntroduction(command);

        return new ResponseEntity<>(
                response,
                HttpStatus.OK
        );
    }


}
