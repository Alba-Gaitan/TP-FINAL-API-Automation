package api.config;

import services.*;

public enum EntityConfiguration {

    USER {
        @Override
        public Class<?> getEntityService() {
            return UserService.class;
        }

    },
    RESPONSE_HEADERS {
        @Override
        public Class<?> getEntityService() {
            return ResponseHeadersService.class;
        }
    },
    WORKSPACE {
        @Override
        public Class<?> getEntityService() {
            return WorkspaceService.class;
        }
    },

    PROJECTS {
        @Override
        public Class<?> getEntityService() {
            return ProjectsService.class;
        }
    },
    EDIT_TIME_ENTRY{
        @Override
        public Class<?> getEntityService() {
            return EditEntryService.class;
        }
    },

    DELETE_TIME_ENTRY{
        @Override
        public Class<?> getEntityService() {
            return DeleteTimeService.class;
        }
    },
    ADD_TIME_ENTRY{
        @Override
        public Class<?> getEntityService() {
            return AddEntryService.class;
        }
    },
    TIME_ENTRY {
        @Override
        public Class<?> getEntityService() {
            return TimeEntryService.class;
        }
    },
    PROJECT {
        @Override
        public Class<?> getEntityService() {
            return ProjectService.class;
        }
    },
    ERROR {
        @Override
        public Class<?> getEntityService() {
            return ErrorService.class;
        }
    };


    public abstract Class<?> getEntityService();
}
