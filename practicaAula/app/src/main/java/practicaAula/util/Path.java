package practicaAula.util;

public class Path {

    public static class Web {
        public static final String INDEX = "/index";
        public static final String LOGIN = "/login";
        public static final String LOGOUT = "/logout";
        public static final String WELCOME = "/welcome";
    }

    public static class Template {
        public static final String INDEX = "/velocity/index/index.vm";
        public static final String LOGIN = "/velocity/login/login.vm";
        public static final String BOOKS_ALL = "/velocity/book/all.vm";
        public static final String BOOKS_ONE = "/velocity/book/one.vm";
        public static final String WELCOME = "/velocity/welcome/welcome.vm";
        public static final String NOT_FOUND = "/velocity/notFound.vm";
    }

}
