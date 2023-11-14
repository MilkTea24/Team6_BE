package com.example.tripKo.domain.file.dto;

import lombok.Builder;
import lombok.Getter;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
public class FileRequest {
    List<MultipartFile> image = new ArrayList<>();
}
