package HW10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FileNavigator {
    private Map<String, List<FileData>> files = new HashMap<>();

    public void add(String path, FileData fileData) {
        List<FileData> fileDataList = files.get(path);
        if (!path.equals(fileData.getPath())) {
            System.out.println("Ошибка: пути не совпадают!");
            return;
        }

        if (fileDataList == null) {
            fileDataList = new ArrayList<>();
        }
        fileDataList.add(fileData);
        files.put(path, fileDataList);
    }

    public List<FileData> find(String path) {
        List<FileData> fileDataList = files.get(path);
        if (fileDataList == null) {
            return new ArrayList<>();
        }
        return fileDataList;
    }

    public List<FileData> filterBySize(long maxSize) {
        List<FileData> fileDataList = new ArrayList<>();
        for (Map.Entry<String, List<FileData>> entry : files.entrySet()) {
            for (FileData file : entry.getValue()) {
                if (file.getSize() <= maxSize) {
                    fileDataList.add(file);
                }
            }
        }
        return fileDataList;
    }
    public void remove(String path) {
        files.remove(path);
    }
    public List<FileData> sortBySize() {
        List<FileData> allFiles = new ArrayList<>();
        for (List<FileData> fileDataList : files.values()) {
            allFiles.addAll(fileDataList);
        }
        allFiles.sort(Comparator.comparingLong(FileData::getSize));
    return allFiles;
    }
}
