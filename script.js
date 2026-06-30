document.getElementById('loginForm').addEventListener('submit', function(event) {
  event.preventDefault();
  const username = document.getElementById('username').value;
  const password = document.getElementById('password').value;
  alert(`尝试登录，用户名: ${username}, 密码: ${password}`);
  // 这里可以添加更多的验证逻辑或发送请求到服务器
});