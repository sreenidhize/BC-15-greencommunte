const { BASE_URL } = window.env || {BASE_URL : 'ae34138365b9b4658b36c22af9346e3e-9d5d996bf8a8c46f.elb.us-east-2.amazonaws.com:8080'};

export const apis = {
  GET_SKILLS: `${BASE_URL}/api/skills`,
  GET_JOBS: `${BASE_URL}/api/jobs/`,
  GET_SAVEDJOBS: `${BASE_URL}/api/saved-jobs/`,
};
