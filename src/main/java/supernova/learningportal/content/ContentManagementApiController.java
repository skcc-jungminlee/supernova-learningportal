package supernova.learningportal.content;

import supernova.learningportal.dto.ContentCategories;
import supernova.learningportal.dto.ContentReview;
import supernova.learningportal.dto.DesiredContentRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-04-22T18:55:09.122869400+09:00[Asia/Seoul]", comments = "Generator version: 7.11.0")
@Controller
@RequestMapping("${openapi.eOpen.base-path:}")
public class ContentManagementApiController implements ContentManagementApi {

    private final NativeWebRequest request;

    @Autowired
    public ContentManagementApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
