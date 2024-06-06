<template>
  <form @submit.prevent="signup">
    <div>
      <label for="email">Email:</label>
      <input type="text" id="email" v-model="email" required>
    </div>
    <div>
      <label for="password">Password:</label>
      <input type="password" id="password" v-model="password" required>
    </div>
    <button type="submit">Signup</button>
  </form>
</template>

<script>
export default {
  data() {
    return {
      email: '',
      password: ''
    };
  },
  methods: {
    async signup() { // 비동기 함수로 정의
      try {
        const response = await fetch('http://localhost:8080/api/signup', {
          method: 'POST',
          headers: {
            'Content-Type': 'application/json'
          },
          body: JSON.stringify({
            email: this.email,
            password: this.password
          })
        });

        // 서버 응답을 JSON으로 파싱
        const data = await response.text();

        // 회원가입 성공 시 처리할 내용을 여기에 작성
        console.log(data);
      } catch (error) {
        console.error(error.message);
      }
    }
  }
};
</script>

