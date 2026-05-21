package re.session07_bai04.Service;

import re.session07_bai04.Exception.NotFoundException;

public class ResourceService {

    public String getResourceById(Long id) {
        if (id == null || id < 0) {
            throw new NotFoundException("Resource with id " + id + " not found");
        }
        return "Resource " + id;
    }
}
