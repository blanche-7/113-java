public class LibrarySystem {
    import java.util.ArrayList;

    public class Library {
        private ArrayList<Book> books;
        private ArrayList<Member> members;

        public Library() {
            this.books = new ArrayList<>();
            this.members = new ArrayList<>();
        }

        public void addBook(Book book) {
            books.add(book);
            System.out.println("新增書籍: " + book.getTitle());
        }

        public void addMember(Member member) {
            members.add(member);
            System.out.println("新增會員: " + member.getName());
        }

        public void listBooks() {
            System.out.println("圖書館現有書籍:");
            if (books.isEmpty()) {
                System.out.println("無書籍。");
            } else {
                for (Book book : books) {
                    System.out.println("  - " + book.getTitle() + " 狀態: " + (book.isBorrowed() ? "已借出" : "可借閱");
                }
            }
        }

        public Member getMember(String name) {
            for (Member member : members) {
                if (member.getName().equals(name)) {
                    return member;
                }
            }
            return null;
        }
    }


    public class LibrarySystem {
        public static void main(String[] args) {
            Library library = new Library();

            // 添加書籍
            Book book1 = new PhysicalBook("Java 入門", "李四", "A1-3");
            Book book2 = new PhysicalBook("資料結構", "王五", "B2-1");
            Book book3 = new EBook("設計模式", "張三", "www.download.com/design-patterns");
            library.addBook(book1);
            library.addBook(book2);
            library.addBook(book3);

            // 添加會員
            Member member1 = new Member("小明");
            Member member2 = new Member("小紅");
            library.addMember(member1);
            library.addMember(member2);

            // 借閱書籍
            member1.borrowBook(book1);
            member1.borrowBook(book3);
            member1.listBorrowedBooks();

            // 另一位會員嘗試借閱已借出的書
            member2.borrowBook(book1);

            // 歸還書籍
            member1.returnBook(book1);
            member1.listBorrowedBooks();

            // 列出圖書館書籍
            library.listBooks();
        }
    }

}
