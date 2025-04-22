package supernova.learningportal.portal;

import supernova.learningportal.dto.Faq;
import supernova.learningportal.dto.InstructorApplication;
import supernova.learningportal.dto.InstructorApproval;
import supernova.learningportal.dto.Notice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-22T18:55:09.122869400+09:00[Asia/Seoul]", comments = "Generator version: 7.11.0")
@Controller
@RequestMapping("${openapi.eOpen.base-path:}")
public class PortalManagementApiController implements PortalManagementApi {

    private final NativeWebRequest request;

    @Autowired
    public PortalManagementApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
