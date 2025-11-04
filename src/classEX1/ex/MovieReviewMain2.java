package classEX1.ex;

public class MovieReviewMain2
{
    public static void main(String[] args)
    {
        MovieReview inception = new MovieReview(); // 영화 리뷰 정보를 담을 수 있는 변수 선언
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화!";

        MovieReview[] movieReviews = new MovieReview[] {inception, aboutTime};
        // for 최적화
        for (int i = 0; i < movieReviews.length; i++)
        {
            System.out.println("영화 제목: " + movieReviews[i].title + ", 리뷰: " + movieReviews[i].review);
        }
        System.out.println("---");

        // for문 - 반복 요소를 변수에 담아서 처리하기
        for (int i = 0; i < movieReviews.length; i++) {
            MovieReview m = movieReviews[i];
            System.out.println("영화 제목: " + m.title + ", 리뷰: " + m.review);
        }
        System.out.println("---");

        // 향상된 for문(Enhanced For Loop) -> 단축키: iter
        for (MovieReview m : movieReviews)
        {
            System.out.println("영화 제목: " + m.title + ", 리뷰: " + m.review);
        }
        System.out.println("---");
    }
}
