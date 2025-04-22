package supernova.learningportal.integration;

import supernova.learningportal.dto.ReceiveCertificateHistoryRequest;
import supernova.learningportal.dto.RequestCertificateIssueRequest;
import supernova.learningportal.dto.SendCompletionRecordRequest;
import supernova.learningportal.dto.SyncExternalCourseRequest;
import supernova.learningportal.dto.SyncMemberInfoRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-22T18:55:09.122869400+09:00[Asia/Seoul]", comments = "Generator version: 7.11.0")
@Controller
@RequestMapping("${openapi.eOpen.base-path:}")
public class IntegrationManagementApiController implements IntegrationManagementApi {

    private final NativeWebRequest request;

    @Autowired
    public IntegrationManagementApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
