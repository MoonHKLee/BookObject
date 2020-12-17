package chapter2;

import java.time.LocalDateTime;


/**
 * 인스턴스 변수는 외부에서 접근이 불가능하고 메서드는 외부에서 접근이 가능하다. 객체는 상태와 행동을 동시에 가지고있는 복합적인 존재이다. 그리고 객체가 스스로 판단하고
 * 행동하는 자율적인 존재이다. 식별 가능한 단위로 하나로 묶어 각각 독립적인 존재로 캡슐화를 한다. 캡슐화를 할 때 접근을 제어하여 인터페이스와 구현을 분리해야한다. 보통
 * 상태는 숨기고 행동만 외부에 공개한다. 클래스의 구현부는 은닉하고 인터페이스만 외부에 노출하는것이 좋다.
 */
public class Screening {

    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    public LocalDateTime getStartTime() {
        return whenScreened;
    }

    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    public Money getMovieFee() {
        return movie.getFee();
    }

    public Reservation reserve(Customer customer, int audienceCount) {
        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
    }

    private Money calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount);
    }
}
