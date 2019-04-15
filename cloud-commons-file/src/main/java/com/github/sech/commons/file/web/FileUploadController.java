package com.github.sech.commons.file.web;

import com.github.sech.commons.base.R;
import com.github.sech.commons.core.beans.FileModel;
import com.github.sech.commons.file.service.FileUploadService;
import com.github.sech.commons.utils.PublicHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * file manage center api 实现 此类提供一个默认实现，可根据自身具体业务做修改
 *
 * @author sech.io
 */
@RestController
public class FileUploadController implements FileUploadApi {

    @Autowired
    private FileUploadService fileService;

    @Override
    public R<FileModel> upload(String pathCode, String pathType, MultipartFile file) throws IOException {
        FileModel fileInfo = fileService.upload(pathCode, pathType, file);
        return new R<FileModel>().data(fileInfo).success();
    }

    @Override
    public R<List<FileModel>> batchUpload(String pathCode, String pathType, List<MultipartFile> files)
            throws IOException {
        List<FileModel> infos = new ArrayList<>();
        if (PublicHelper.isNotEmpty(files)) {
            for (MultipartFile file : files) {
                infos.add(fileService.upload(pathCode, pathType, file));
            }
        }
        return new R<List<FileModel>>().data(infos).success();
    }

    @Override
    public void download(@PathVariable String attId, HttpServletResponse response) throws IOException {
        this.fileService.download(attId, response);
    }

    @Override
    public R<Boolean> del(@PathVariable String attId) throws IOException {
        this.fileService.delFile(attId);
        return new R<Boolean>().data(true).success();
    }

}
